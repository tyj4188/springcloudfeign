/* 
 * 项目名：	com.john.hystrix
 * 文件名：	GreetingHystrix
 * 模块说明：	
 * 修改历史：
 * 2017/11/9 - ihui - 创建。
 */

package com.john.hystrix;

import com.john.service.ScheduleServiceGreeting;
import org.springframework.stereotype.Component;

/**
 * @author ihui
 * @date 2017/11/9
 */

/**
 * 断路器类
 */
@Component
public class GreetingHystrix implements ScheduleServiceGreeting {
    /**
     * 后备方案, 在 GreetingHystrix.greeting 方法失败后会调用此实现类的 greeting 方法.
     * @param name
     * @return
     */
    @Override
    public String greeting(String name) {
        return "Sorry, " + name;
    }
}
