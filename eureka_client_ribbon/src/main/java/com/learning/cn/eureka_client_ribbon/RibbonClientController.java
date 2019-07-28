package com.learning.cn.eureka_client_ribbon;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: RibbonClientController
 * @date: 2019/7/28 0028 下午 21:43
 * @author: marryfeng
 */
@RestController
@Api(value = "测试ribbon的contorller类")
@RequestMapping("/test/")
public class RibbonClientController {

    @Autowired
    private RibbonClientService ribbonClientService;

    @ApiOperation("测试controller")
    @RequestMapping("ribbon")
    @ApiImplicitParam(value = "nm",name = "nm",required = true)
    public String getResult(@RequestParam String nm){
        return  ribbonClientService.hiService(nm);
    }
}
