package org.zerock;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.zerock.config.RootConfig;

public class WebConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        /* getRootConfigClasses는 ContextLoaderListener가
        ContextLoaderListener::: RootApplicationContext를 생성하는 클래스
        (root-context.xml)을 대신하는 클래스를 지정한다.
        ContextLoaderListener 클래스는 ServletContextListener 인터페이스를 구현
        Servlet의 생명주기를 관리
        생성한 어플리케이션 컨텍스트를 설정하는데 사용한다.
        */

        return new Class[] {RootConfig.class};

    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return null;
        /*
        getServletConfigClasses ::: DispatcherServlet 사용되는 빈들을 등록

         */
    }


    @Override
    protected String[] getServletMappings() {
        /*
         getServletMapping::: DispatcherServlet이 매핑되기 위한 하나 혹은 여러 개의 패스를 지정
         */
        return null;
    }
}
