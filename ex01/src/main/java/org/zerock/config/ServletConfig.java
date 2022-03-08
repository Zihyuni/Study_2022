package org.zerock.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.io.IOException;

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
        registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
    }
    @Bean(name = "multipartResolver")
    //여기는 파일업로드 처리하는 메소드입니다
    public CommonsMultipartResolver getResolver() throws IOException {
        CommonsMultipartResolver resolver = new CommonsMultipartResolver();

        //10MB
        resolver.setMaxUploadSize(1024 * 1024 * 10);

        //2MB
        resolver.setMaxInMemorySize(1024*1024*2);

        //1MB
        resolver.setMaxUploadSize(1024*1024);

        //temp upload
        resolver.setUploadTempDir(new FileSystemResource("C:\\upload\\tmp"));
        resolver.setDefaultEncoding("UTF-8");

        return resolver;

    }
}
