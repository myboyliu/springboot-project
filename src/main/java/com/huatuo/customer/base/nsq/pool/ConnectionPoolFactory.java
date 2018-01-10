package com.huatuo.customer.base.nsq.pool;

import io.netty.channel.ChannelFuture;
import org.apache.commons.pool2.BaseKeyedPooledObjectFactory;
import org.apache.commons.pool2.PooledObject;
import org.apache.commons.pool2.impl.DefaultPooledObject;

import com.huatuo.customer.base.nsq.Connection;
import com.huatuo.customer.base.nsq.NSQCommand;
import com.huatuo.customer.base.nsq.NSQConfig;
import com.huatuo.customer.base.nsq.ServerAddress;

public class ConnectionPoolFactory extends BaseKeyedPooledObjectFactory<ServerAddress, Connection> {
    private NSQConfig config;


    public ConnectionPoolFactory(NSQConfig config) {
        this.config = config;
    }

    @Override
    public Connection create(final ServerAddress serverAddress) throws Exception {
        return new Connection(serverAddress, config);
    }


    @Override
    public PooledObject<Connection> wrap(final Connection con) {
        return new DefaultPooledObject<>(con);
    }

    @Override
    public boolean validateObject(final ServerAddress key, final PooledObject<Connection> p) {
        ChannelFuture command = p.getObject().command(NSQCommand.instance("NOP"));
        return command.awaitUninterruptibly().isSuccess();
    }

    @Override
    public void destroyObject(final ServerAddress key, final PooledObject<Connection> p) throws Exception {
        p.getObject().close();
    }
}
