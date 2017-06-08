package cn.shmedo.config.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import javax.servlet.ServletContext;

/**
 * Created by Liudongdong on 17/6/8.
 */
@Configuration
public class ViewBeanConfig {
    @Bean
    public SpringResourceTemplateResolver getTemplateResolve() {
//        ServletContextTemplateResolver resolver=new ServletContextTemplateResolver();
        SpringResourceTemplateResolver resolver = new SpringResourceTemplateResolver();
        resolver.setPrefix("classpath:/templates/");
        resolver.setSuffix(".html");
        resolver.setTemplateMode("HTML5");
        resolver.setCharacterEncoding("UTF-8");
        return resolver;
    }

    @Bean
    public SpringTemplateEngine getEngine() {
        SpringTemplateEngine engine = new SpringTemplateEngine();
        engine.setTemplateResolver(getTemplateResolve());
        return engine;
    }

    @Bean
    public ThymeleafViewResolver getViewResolve() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine(getEngine());
        viewResolver.setCharacterEncoding("UTF-8");
        return viewResolver;
    }

}