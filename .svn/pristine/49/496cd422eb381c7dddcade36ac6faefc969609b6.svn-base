package com.huatuo.customer.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import com.huatuo.customer.domain.OrderResult;
import com.huatuo.customer.domain.PayOrder;
import com.huatuo.customer.domain.PayOrderCriteria;
import com.huatuo.customer.domain.PayOrderWithBLOBs;
import com.huatuo.customer.query.OrderQuery;

public interface PayOrderMapper {
    int countByExample(PayOrderCriteria example);

    int deleteByExample(PayOrderCriteria example);

    int deleteByPrimaryKey(String orderNo);

    int insert(PayOrder record);

    int insertSelective(PayOrderWithBLOBs record);

    List<PayOrderWithBLOBs> selectByExampleWithBLOBsWithRowbounds(PayOrderCriteria example, RowBounds rowBounds);

    List<PayOrderWithBLOBs> selectByExampleWithBLOBs(PayOrderCriteria example);

    List<PayOrder> selectByExampleWithRowbounds(PayOrderCriteria example, RowBounds rowBounds);

    List<PayOrder> selectByExample(PayOrderCriteria example);

    PayOrderWithBLOBs selectByPrimaryKey(String orderNo);

    int updateByExampleSelective(@Param("record") PayOrderWithBLOBs record, @Param("example") PayOrderCriteria example);

    int updateByExampleWithBLOBs(@Param("record") PayOrderWithBLOBs record, @Param("example") PayOrderCriteria example);

    int updateByExample(@Param("record") PayOrder record, @Param("example") PayOrderCriteria example);

    int updateByPrimaryKeySelective(PayOrder record);

    int updateByPrimaryKeyWithBLOBs(PayOrderWithBLOBs record);

    int updateByPrimaryKey(PayOrder record);
    
    List<OrderResult> selectOrdersList(OrderQuery orderQuery); 
    
    Integer selectOrdersCount(OrderQuery orderQuery); 
    
    OrderResult selectOrderDetailsByOrderNo(OrderQuery orderQuery);

    /**
     * 根据订单号查询订单信息
     * @param map
     * @return
     */
	PayOrder getPayOrderByOrderNo(Map<String, Object> map);
	
	/**
	 * 根据订单号查询一条订单
	 * @param orderNumber
	 * @return
	 */
	PayOrder selectPayOrderByOrderNumber(String orderNumber);
	
	/**
	 * 根据业务订单id查询对应的一条支付订单
	 * @return
	 */
	PayOrder selectPayOrderByVisitId(Long visitId);

	/**
	 * 通过家庭医生信息获取家医订单
	 * @param userId			用户id
	 * @param dtTeamId			团队id
	 * @param teamPackageId		套餐id
	 * @param nowTime			当前时间
	 * @return
	 */
	List<PayOrder> getOrderByDtUserPackage(@Param("userId") String userId, 
									 		@Param("dtTeamId") String dtTeamId,
									 		@Param("teamPackageId") String teamPackageId, 
									 		@Param("nowTime") String nowTime);

	/**
	 * 修改家医订单状态
	 * @param orderNos		家医订单集合
	 * @param serviceState	业务状态
	 * @param orderState	订单状态
	 * @return
	 */
	int updateByOrderNos(@Param("orderNos") List<String> orderNos, 
						 @Param("serviceState") Integer serviceState, 
						 @Param("orderState") Integer orderState);
}


