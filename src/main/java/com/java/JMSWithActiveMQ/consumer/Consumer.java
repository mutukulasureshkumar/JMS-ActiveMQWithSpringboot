package com.java.JMSWithActiveMQ.consumer;

import javax.jms.Message;
import javax.jms.Session;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination = "imMemory.queue")
	public void consumer(String message){
		System.out.println("Received Message from queue :: " + message);
	}
	
	@JmsListener(destination = "imMemory.topic")
    public void receiveTopicMessage(@Payload String msg,
                                    @Headers MessageHeaders headers,
                                    Message message,
                                    Session session) {

		System.out.println("received <" + msg + ">");
    }
}

