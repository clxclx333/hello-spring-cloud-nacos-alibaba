package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.config;

import com.funtl.hello.spring.cloud.alibaba.nacos.consumer.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class NacosConsumerConfiguration {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public User user(){
        return new User("zzyi","uio");
    }
}
