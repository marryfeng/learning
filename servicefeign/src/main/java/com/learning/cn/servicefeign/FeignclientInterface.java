package com.learning.cn.servicefeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @description: FeignclientInterface
 * @date: 2019/7/30 0030 下午 22:22
 * @author: marryfeng
 */
@FeignClient(value = "eurekaclient")
public interface FeignclientInterface {

    @RequestMapping("/hi")
    String getFeignInformation(@RequestParam String name);

}




