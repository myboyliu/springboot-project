package com.huatuo.customer.base.redis;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.data.redis.connection.RedisConnection;
import org.springframework.data.redis.core.RedisCallback;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

/**
 * REDIS数据访问
 */
@Repository
public class RedisSupport {

	@Autowired
	private RedisTemplate<String, Serializable> template;

	private static final Long EXPIRE = Long.MAX_VALUE;

	/**
	 * 以字符串键-序列化值存储
	 * 
	 * @param key
	 * @param value
	 * @return
	 */
	public boolean set(final String key, Object value, long time) {
		if (key == null) {
			return false;
		}
		final long expireTime = time > 0 ? time : EXPIRE;
		try {
			final Serializable sv = (Serializable) value;
			return (Boolean) template.execute(new RedisCallback<Object>() {
				@Override
				public Object doInRedis(RedisConnection connection) throws DataAccessException {
					ValueOperations<String, Serializable> ops = template.opsForValue();
					ops.set(key, sv, expireTime, TimeUnit.SECONDS);
					return true;
				}
			});
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 以字符串键查询
	 * 
	 * @param key
	 * @return
	 */
	public Serializable get(final String key) {
		try {
			return template.execute(new RedisCallback<Serializable>() {
				@Override
				public Serializable doInRedis(RedisConnection connection) throws DataAccessException {
					byte[] skey = template.getStringSerializer().serialize(key);
					if (connection.exists(skey)) {
						ValueOperations<String, Serializable> ops = template.opsForValue();
						Serializable oval = ops.get(key);
						return oval;
					}
					return null;
				}
			});
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 是否存在指定的字符串类型的key
	 * 
	 * @param key
	 * @return
	 */
	public boolean exists(String key) {
		if (key == null) {
			return false;
		}
		try {
			return template.hasKey(key);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return false;
	}

	/**
	 * 删除字符串类型的key对应的数据
	 * 
	 * @param key
	 */
	public void delete(String key) {
		if (key == null) {
			return;
		}
		try {
			template.delete(key);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**
	 * 删除一个hash数据
	 * 
	 * @param key
	 * @param field
	 */
	public void hDel(String key, String field) {
		if (key == null || field == null) {
			return;
		}
		try {
			template.opsForHash().delete(key, field);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**
	 * 设置整个hash表
	 * 
	 * @param key
	 * @param map
	 */
	public void hSet(String key, Map<? extends Object, ? extends Object> map) {
		if (key == null) {
			return;
		}
		try {
			template.delete(key);
			template.opsForHash().putAll(key, map);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**
	 * 设置hash表的一个数值
	 * 
	 * @param key
	 * @param field
	 * @param value
	 */
	public void hSet(String key, String field, Object value) {
		if (key == null || field == null) {
			return;
		}
		try {
			template.opsForHash().put(key, field, value);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	/**
	 * 获取hash表所有数据
	 * 
	 * @param key
	 * @return
	 */
	public List<Object> hGet(String key) {
		if (key == null) {
			return null;
		}
		try {
			return template.opsForHash().values(key);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 获取hash表中一个数据
	 * 
	 * @param key
	 * @param field
	 * @return
	 */
	public Object hGet(String key, String field) {
		if (key == null || field == null) {
			return null;
		}
		try {
			return template.opsForHash().get(key, field);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 向redis中存储一个List集合,
	 * 且集合中每个元素都是从前到后存储顺序,
	 * 并设置过期时间,以秒为单位,
	 * ,如果没有设置,则不做定时销毁,
	 * @param key
	 * @param timeout
	 * @param values
	 * @return
	 */
	public Boolean lSetAll(String key, Long timeout, List<Serializable> list){
		if(key == null){
			throw new RuntimeException("存入Redis的Key为空");
		}if(list == null){
			throw new RuntimeException("存入Redis的Value为空");
		}if(timeout != null){
			template.opsForSet().getOperations().expire(key, timeout, TimeUnit.SECONDS);
		}
		/**
		 * 先将这个Key对应的List集合的值删除
		 */
		this.lDelete(key);
		try {
			for (Serializable object : list) {
				template.opsForList().rightPush(key, object);	
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 根据下标设置某个List集合中的某一个元素
	 * @param key
	 * @param index
	 * @param value
	 */
	public Boolean lSet(String key, Long index,Serializable value){
		if(key == null){
			throw new RuntimeException("存入Redis的Key为空");
		}
		if(index == null){
			throw new RuntimeException("存入Redis的索引为空");
		}
		if(value == null){
			throw new RuntimeException("存入Redis的Value为空");
		}
		try {
			template.opsForList().set(key, index, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 根据下标删除List集合中的某一个元素
	 * @param key
	 * @param index
	 * @return
	 */
	public Boolean lDeleteOne(String key, Long index, Object value){
		if(key == null){
			throw new RuntimeException("删除操作的Key为空");
		}
		if(index == null){
			throw new RuntimeException("删除操作的索引为空");
		}
		if(value == null){
			throw new RuntimeException("删除操作的Value为空");
		}
		try {
			template.opsForList().remove(key, index, value);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 根据Key删除整个List
	 * @param key
	 * @return
	 */
	public Boolean lDelete(String key){
		if(key == null){
			throw new RuntimeException("删除操作的Key为空");
		}
		try {
			template.delete(key);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	/**
	 * 根据Key获取整个List集合
	 * @param key
	 * @return
	 */
	public List<Serializable> lGetAll(String key){
		if(key == null){
			throw new RuntimeException("Key值不能为空");
		}
		return template.opsForList().range(key, 0, -1);
	}
	
	/**
	 * 根据下标返回List集合中的某一个元素
	 * 如果下标有误则直接回返回null
	 * @param key
	 * @param index
	 * @return
	 */
	public Serializable lGet(String key, Long index){
		try {
			return template.opsForList().range(key, index, index).get(0);
		} catch (Exception e) {
			return null;
		}
	}
}