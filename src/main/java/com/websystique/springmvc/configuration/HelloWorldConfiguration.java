package com.websystique.springmvc.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ImportResource({ "classpath:datasource-config.xml" })
@EnableWebMvc
@ComponentScan(basePackages = {"com.spring","com.websystique"})
public class HelloWorldConfiguration {
	

}