package com.atqgh.springboot.controller;

import com.atqgh.springboot.bean.User;
import com.atqgh.springboot.mapper.UserMapper;
import com.atqgh.springboot.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//import com.atqgh.springboot.mapper.NlCoreAccTranflowMapper;

/**
 * @Author: qiguohui
 * @Description:
 * @Date: Created in 16:15 2019/4/30
 * @Modified By:
 **/
@RequestMapping("/test")
@Controller
public class TestController {

//    @Autowired
//    NlCoreAccTranflowMapper nlCoreAccTranflowMapper;

    @Autowired
    UserMapper userMapper;


    @RequestMapping("/result")
    @ResponseBody
    public Map<String,String> result(){
        Map<String,String> map = new HashMap<>();
        map.put("name","zhangsanfeng");
        map.put("age","17");
        map.put("add","shanghai");
        return map;
    }

    @RequestMapping("/control")
    @ResponseBody
    public Object findObject(String beanName){
        return SpringContextUtil.getBean(beanName);
    }

//    @RequestMapping("/ikk")
//    @ResponseBody
//    public String ikk(){
//        Map<String,Object> resultMap = new HashMap<String,Object>();
//        resultMap.put("notifyResult","6");
//        resultMap.put("errorMsg","6");
//        resultMap.put("tranFlow","1");
////        resultMap.put("innerAccNo","6");
//        int num = nlCoreAccTranflowMapper.updateByPrikey(resultMap);
//        return "dddddd";
//    }

    @RequestMapping("/user")
    @ResponseBody
    public String user(){
        User user=new User();
        user.setName("jack");
        user.setSex("男");
        user.setAge(20);
        userMapper.addUser(user);
        return "successful";
    }

    @RequestMapping("/po")
    @ResponseBody
    public Integer po(String name){
        Integer id = userMapper.selectOne(name);
        return id;
    }
}
