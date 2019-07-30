package com.learning.cn.eurekaclient.mallcontroller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: testContrller
 * @date: 2019/7/23 0023 下午 21:52
 * @author: marryfeng
 */
@Api("测试swagger2")
@RestController
@RequestMapping("/test/")
public class testContrller {


    @GetMapping("hi")
   /*
    * @Description:test01
    * @Author: marryfeng
    * @Date: 2019/7/23 0023 下午 22:43
    * @Daram: []
    * @Return: java.lang.String       
    */
    public String test01(){
       return "hello,swagger2";
    }


}
