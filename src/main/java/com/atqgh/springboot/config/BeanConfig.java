package com.atqgh.springboot.config;

import com.atqgh.springboot.bean.Demo2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 9:55 2019/5/31
 * @Modified By:
 **/

@Configuration
public class BeanConfig {

    @Bean(name="testDemo")
    public Demo2 generateDemo() {
        Demo2 demo = new Demo2();
        demo.setId(12345);
        demo.setName("test");
        return demo;
    }
}
