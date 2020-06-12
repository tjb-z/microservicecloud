package com.atguigu.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

@Configuration
public class ConfigBean {

	
	@Bean
	@LoadBalanced // Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端       负载均衡的工具。
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * 
	 * @return
	 */
	@Bean
	public IRule myRule() {
		return new RoundRobinRule();// 轮询
//		return new RandomRule();
	}
	
	
}
