package com.lznhub.config;

import io.swagger.models.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description TODO
 * @Author LZN
 * @Date 2021/4/23 14:30
 **/
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.lznhub.controller")
public class SwaggerConfig {
    @Bean
    public Docket customDocket() {
        //
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }
    private ApiInfo apiInfo() {
        return new ApiInfo("前台API接口",//大标题 title
                "Blog接口文档",//小标题
                "0.0.1",//版本
                "www.baidu.com",//termsOfServiceUrl
                "LZN",//作者
                "Blog",//链接显示文字
                "https://www.baidu.me"//网站链接
        );
    }
}
