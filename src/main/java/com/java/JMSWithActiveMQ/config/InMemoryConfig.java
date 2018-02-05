package com.java.JMSWithActiveMQ.config;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

@Configuration
@EnableJms
public class InMemoryConfig {

	@Bean
	public Queue queue(){
		return new ActiveMQQueue("imMemory.queue");
	}
}
