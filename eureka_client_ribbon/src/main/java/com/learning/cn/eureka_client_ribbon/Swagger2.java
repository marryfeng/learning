package com.learning.cn.eureka_client_ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class Swagger2 {
	@Bean
	public Docket docket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(apiInfo())
				.select()
				// 当前包路径
				.apis(RequestHandlerSelectors.basePackage("com.learning.cn.eureka_client_ribbon.RibbonClientController"))
				.paths(PathSelectors.any())
				.build();
	}
	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				//页面标题
				.title("test ribbon API")
				//创建人
				.contact(new Contact("marry", "http://www.baidu.com", "marr@163.com"))
				//版本号
				.version("1.0")
				//描述
				.description("RESTful API")
				.build();
	}
}
