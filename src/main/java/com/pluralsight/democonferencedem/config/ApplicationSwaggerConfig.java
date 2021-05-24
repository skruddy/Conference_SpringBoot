package com.pluralsight.democonferencedem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@Import(BeanValidatorPluginsConfiguration.class)
public class ApplicationSwaggerConfig  
{
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
        		.select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
                
    }
    
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
        		.title("Conference API")
        		.version("1.0")
        		.description("For handling a conference")
        		.contact(new Contact("Saquib Khan", "www.saquib-khan.com", "skruddy@gmail.com"))
        		.build();
        }
}

