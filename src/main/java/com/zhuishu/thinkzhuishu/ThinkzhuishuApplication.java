package com.zhuishu.thinkzhuishu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ThinkzhuishuApplication {

    @RequestMapping("/user/hello")
    String index(){
        return "zhuishu welcome!";
    }
    public static void main(String[] args) {
        SpringApplication.run(ThinkzhuishuApplication.class, args);
    }

}
