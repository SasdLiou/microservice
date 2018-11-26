package com.aliyun.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/23
 */
@Configuration
public class MySelfRule {
	@Bean
	public IRule myRule() {
		// Ribbon默认是轮询，我自定义为随机
		//return new RandomRule();

		// 我自定义为每台机器5次
		return new RandomRule_BOB();
	}
}
