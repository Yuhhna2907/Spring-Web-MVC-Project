package com.codegym.nasahibernateorm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.codegym.nasahibernateorm")
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public SpringResourceTemplateResolver templateResolver() {
        SpringResourceTemplateResolver r = new SpringResourceTemplateResolver();
        r.setPrefix("/WEB-INF/views/");
        r.setSuffix(".html");
        r.setCharacterEncoding("UTF-8");
        return r;
    }

    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine e = new SpringTemplateEngine();
        e.setTemplateResolver(templateResolver());
        return e;
    }

    @Bean
    public ThymeleafViewResolver viewResolver() {
        ThymeleafViewResolver v = new ThymeleafViewResolver();
        v.setTemplateEngine(templateEngine());
        v.setCharacterEncoding("UTF-8");
        return v;
    }
}
