package com.ecommerce.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.ecommerce")
public class AppConfig implements WebMvcConfigurer{

	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setViewClass(JstlView.class);
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	 @Bean(name = "multipartResolver")
	    public CommonsMultipartResolver multipartResolver() {
	        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
	        multipartResolver.setMaxUploadSize(10240000);
	        return multipartResolver;
	    }
	
	 @Override
	    public void addResourceHandlers(ResourceHandlerRegistry registry) { 
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	    }
}
