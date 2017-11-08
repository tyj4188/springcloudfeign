/* 
 * 项目名：	com.john
 * 文件名：	Application
 * 模块说明：	
 * 修改历史：
 * 2017/11/8 - ihui - 创建。
 */

package com.john;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @author ihui
 * @date 2017/11/8
 */
@SpringBootApplication
@EnableEurekaClient // 服务注册
@EnableFeignClients // 负载均衡
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
