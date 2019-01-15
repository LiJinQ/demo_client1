package com.ljq.demo_client1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class DemoClient1Application {

    /**
     * 测试接口
     * @return
     */
    @GetMapping("/test")
    public String test(){
        return "测试成功！";
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoClient1Application.class, args);
    }

}

