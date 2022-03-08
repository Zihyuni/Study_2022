package org.zerock.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@EnableWebMvc
@ComponentScan(basePackages = {"org.zerock.controller"})
public class ServletConfig implements WebMvcConfigurer {


    @Override //뷰리졸버 생성하는 클래스인거같다.
    public void configureViewResolvers(ViewResolverRegistry registry){
        InternalResourceViewResolver bean = new InternalResourceViewResolver();
        bean.setViewClass(JstlView.class);
        bean.setPrefix("/WEB-INF/views/");//접두사
        bean.setSuffix(".jsp");//접미사

        registry.viewResolver(bean);
    }

    @Override//리소스 밑에 파일들 읽어서 핸들러 매핑해주는 거같음
    public void addResourceHandlers(ResourceHandlerRegistry registry){
        registry.addResourceHandler("//**").addResourceLocations("//");
    }
}
