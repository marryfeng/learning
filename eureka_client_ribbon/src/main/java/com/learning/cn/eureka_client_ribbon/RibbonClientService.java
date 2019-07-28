package com.learning.cn.eureka_client_ribbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: RibbonClientService
 * @date: 2019/7/28 0028 下午 22:14
 * @author: marryfeng
 */
@Service
public class RibbonClientService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        return restTemplate.getForObject("http://EUREKACLIENT/hi?name="+name,String.class);
    }

}
