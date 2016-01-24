package Netty.NettyWriter;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundMessageHandlerAdapter;

public class TouchLogManagerHandler extends ChannelInboundMessageHandlerAdapter<String> {

	public void messageReceived(ChannelHandlerContext ctx, String msg) throws Exception {
		System.out.println("Do stuff"+msg);
	}

	

}
