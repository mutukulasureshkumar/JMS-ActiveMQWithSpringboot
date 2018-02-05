package com.java.JMSWithActiveMQ.producer;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired
	private Queue queue;
	
	public void publishQueue(String message){
		jmsTemplate.convertAndSend(queue, message);
	}
	
	public void publishTopic(String message){
		jmsTemplate.convertAndSend("imMemory.topic", message);
	}
}
