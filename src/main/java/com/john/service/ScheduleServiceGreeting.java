/* 
 * 项目名：	com.john.service
 * 文件名：	SchedualServiceGreeting
 * 模块说明：	
 * 修改历史：
 * 2017/11/8 - ihui - 创建。
 */

package com.john.service;

import com.john.hystrix.GreetingHystrix;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author ihui
 * @date 2017/11/8
 */

/**
 *  Feign 自带 Hystrix, 需不要额外引用Jar
 *  value - 指定服务名
 *  fallback - 指定断路器类, 断路器类需要实现此接口
 */
@FeignClient(value = "SPRINGCLOUDAPP", fallback = GreetingHystrix.class)
public interface ScheduleServiceGreeting {
    /**
     * 调用 SPRINGCLOUDAPP/greeting接口, 参数为 name
     * @param name
     * @return
     */
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String greeting(@RequestParam(value = "name") String name);
}
