/* 
 * 项目名：	com.john.test
 * 文件名：	GreetingController
 * 模块说明：	
 * 修改历史：
 * 2017/11/8 - ihui - 创建。
 */

package com.john.test;

import com.john.service.ScheduleServiceGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ihui
 * @date 2017/11/8
 */
@RestController
public class GreetingController {

    @Autowired
    private ScheduleServiceGreeting serviceGreeting;

    @RequestMapping("/greeting")
    public String greeting(String name) {
        return serviceGreeting.greeting(name);
    }
}
