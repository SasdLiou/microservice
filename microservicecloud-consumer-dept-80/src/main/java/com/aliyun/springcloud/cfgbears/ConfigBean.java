package com.aliyun.springcloud.cfgbears;

import com.aliyun.myrule.RandomRule_BOB;
import com.netflix.loadbalancer.IRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * ...
 *
 * @author Bob
 * @date 2018/11/23
 */

//boot -->spring   applicationContext.xml --- @Configuration配置
//ConfigBean = applicationContext.xml

@Configuration
public class ConfigBean {

    //Spring Cloud Ribbon是基于Netflix Ribbon实现的一套客户端的负载均衡的工具。
    @LoadBalanced
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    public IRule myRule() {
        //默认七个策略
        //达到的目的，用我们重新选择的随机算法替代默认的轮询。
        //轮询
        //return new RoundRobinRule();
        //随机
        //return new RandomRule();
        // 先按RoundRobinRule策略获取服务，如果获取服务失败则在指定时间内会重试，获取可用服务
        //return new RetryRule();

        //自定义策略:每台机器五次
        return new RandomRule_BOB();
    }
}

/*
@Bean
public UserServcie getUserServcie() {
	return new UserServcieImpl();
}*/

// applicationContext.xml == ConfigBean(@Configuration)
//<bean id="userServcie" class="com.aliyun.tmall.UserServiceImpl">
