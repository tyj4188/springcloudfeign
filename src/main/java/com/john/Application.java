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
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author ihui
 * @date 2017/11/8
 */

/**
 * 使用 Hystrix 仪表盘 必须要 EnableCircuitBreaker 注解, 而且需要三个环境引入,
 * 分别是: spring-boot-starter-actuator, spring-cloud-starter-hystrix, spring-cloud-starter-hystrix-dashboard;
 */
@SpringBootApplication
@EnableEurekaClient // 服务注册
@EnableFeignClients // 负载均衡
@EnableCircuitBreaker // 使用 Hystrix 仪表盘 必须要加此注解
@EnableHystrixDashboard // 启动 Hystrix 仪表盘 - 访问 /hystrix
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
