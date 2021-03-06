package com.dc.nettyserver;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import io.netty.channel.ChannelFuture;




/**
 * 通过Eureka的client向Eureka发送nettyserver的配置信息
 * @author gavin
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class ServerRegitryApp {
	public static void main(String[] msg){
		 new SpringApplicationBuilder(ServerRegitryApp.class).web(true).run(msg);
		 
		 //启动socket server
		 //端口号可以读配置
		 try {
			 ChannelFuture f=new Server().start(66);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
