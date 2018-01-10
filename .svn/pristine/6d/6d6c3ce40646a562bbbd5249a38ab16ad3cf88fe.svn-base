package com.huatuo.customer.base.nsq.netty;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.huatuo.customer.base.nsq.Connection;
import com.huatuo.customer.base.nsq.frames.NSQFrame;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;


public class NSQHandler extends SimpleChannelInboundHandler<NSQFrame> {
	private static final Logger logger = LoggerFactory.getLogger(NSQHandler.class);
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);
        Connection connection = ctx.channel().attr(Connection.STATE).get();
        if(connection != null) {
        	logger.info("Channel disconnected! " + connection);
        } else {
        	logger.error("No connection set for : " + ctx.channel());
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        logger.error("NSQHandler exception caught", cause);

		ctx.channel().close();
		Connection con = ctx.channel().attr(Connection.STATE).get();
		if (con != null) {
            con.close();
        } else {
        	logger.warn("No connection set for : " + ctx.channel());
		}
	}

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, final NSQFrame msg) throws Exception {
        final Connection con = ctx.channel().attr(Connection.STATE).get();
        if (con != null) {//() -> con.incoming(msg)
            ctx.channel().eventLoop().execute(new Runnable() {
				@Override
				public void run() {
					con.incoming(msg);
				}
			});
        } else {
        	logger.warn("No connection set for : " + ctx.channel());
        }
    }
}
