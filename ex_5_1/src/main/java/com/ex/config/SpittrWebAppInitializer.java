package com.ex.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by chun on 2017/3/25.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{


    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[0];
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class<?>[0];
    }

    //将dispatcherServlet映射到"/"
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
