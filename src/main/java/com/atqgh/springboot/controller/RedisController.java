package com.atqgh.springboot.controller;

import com.atqgh.springboot.util.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 12:30 2019/7/23
 * @Modified By:
 **/

@RequestMapping("/redis")
@Controller
public class RedisController {

    @Autowired
    RedisUtil redisUtil;

    @RequestMapping("/setString")
    @ResponseBody
    public String setString(){
        redisUtil.set("mykey1",3);
        redisUtil.expire("mykey1",15);
        return "successful";
    }

}
