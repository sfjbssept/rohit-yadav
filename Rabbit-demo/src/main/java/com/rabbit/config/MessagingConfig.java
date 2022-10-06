package com.rabbit.config;

import java.util.Queue;

import javax.management.Query;
import javax.naming.Binding;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.converter.MappingJackson2MessageConverter;

import ch.qos.logback.classic.pattern.MessageConverter;

@Configuration
public class MessagingConfig {

	private static final String ROUTING_KEY = "employee-routing-key";
	private static final String QUEUENAME = "Employee-queue";
	private static final String EXCHANGENAME = "Employee-exchange";

	@Bean
	public Queue queue() {
		return (Queue) new Query();
	}
	

	@Bean
	public TopicExchange exchange() {
		return new TopicExchange(EXCHANGENAME);
	}

	@Bean
	public org.springframework.amqp.core.Binding binding(Queue queue , TopicExchange topicExchange) {
		return BindingBuilder.bind((org.springframework.amqp.core.Queue) queue).to(topicExchange).with(ROUTING_KEY);
	}
	
	@Bean
	public MessageConverter converter() {
		return new Jackson2JsonMessageConverter();
		
	}
}
