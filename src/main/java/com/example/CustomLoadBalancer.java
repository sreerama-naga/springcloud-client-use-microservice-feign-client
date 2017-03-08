package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.PingUrl;

public class CustomLoadBalancer {
	
	@Autowired
	private IClientConfig config;
	
	@Bean
	private IPing ribbonPing(IClientConfig config){
		
		return new PingUrl();
	}
	
	public IRule ribbonRule(IClientConfig config){
		return new AvailabilityFilteringRule();
	}
}
