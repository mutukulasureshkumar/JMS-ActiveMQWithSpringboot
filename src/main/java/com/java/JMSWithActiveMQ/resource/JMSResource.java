package com.java.JMSWithActiveMQ.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.JMSWithActiveMQ.producer.Producer;

@RestController
@RequestMapping("/rest/publish")
public class JMSResource {
	
	@Autowired
	private Producer producer;
	
	@RequestMapping("/{message}")
	public String publish(@PathVariable("message") final String message){
		producer.publishQueue(message);
		
		for (int i = 0; i < 5; i++){
			producer.publishTopic(message + " :: " + i);
        }
		return "Published Successfully...!!!";
	}
}
