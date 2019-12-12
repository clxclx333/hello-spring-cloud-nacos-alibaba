package com.funtl.hello.spring.cloud.alibaba.nacos.consumer.pojo;

import lombok.Data;

@Data
public class User {
    String username;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    String password;
}
