package com.atguigu.config;

import com.atguigu.component.MyLocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index.html").setViewName("login");
    }

//    @Override
//    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
//    }
//    @Override
//    public void addInterceptors(InterceptorRegistry registry) {
//        // addPathPatterns 用于添加拦截规则
//        // excludePathPatterns 用户排除拦截
//        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/**").excludePathPatterns("/toLogin","/login");
////        super.addInterceptors(registry);
//    }
//    @Bean
//    public LocaleResolver localeResolver(){
//        return new MyLocaleResolver();
//    }
}
