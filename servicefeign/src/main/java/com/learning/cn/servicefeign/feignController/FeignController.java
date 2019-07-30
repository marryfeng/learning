package com.learning.cn.servicefeign.feignController;

import com.learning.cn.servicefeign.FeignclientInterface;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: FeignController
 * @date: 2019/7/30 0030 下午 22:20
 * @author: marryfeng
 */
@RestController
@Api(value = "feign的测试")
public class FeignController {
    @Autowired
    private FeignclientInterface feignclientInterface;

    @RequestMapping("/feign")
    public String getInformation(@RequestParam String s){
      return   feignclientInterface.getFeignInformation(s);
    }



}
