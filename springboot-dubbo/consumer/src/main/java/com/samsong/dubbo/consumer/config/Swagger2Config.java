package com.samsong.dubbo.consumer.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
/** 是否打开swagger **/
@ConditionalOnExpression("'${swagger.enable}' == 'true'")
public class Swagger2Config {

        @Bean
        public Docket createRestApi() {
                return new Docket(DocumentationType.SWAGGER_2)
                        .apiInfo(apiInfo())
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.samsong.dubbo.consumer.controller"))
                        .paths(PathSelectors.any())
                        .build();
        }

        private ApiInfo apiInfo() {
                return new ApiInfoBuilder()
                        .title("springboot dubbo api")
                        .description("springboot dubbo api")
                        .termsOfServiceUrl("https://github.com/ThreadSamsong")
                        .contact("samsong")
                        .version("1.0.0")
                        .build();
        }
}
