package com.jdbc.config;



import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer  {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class[] { WebMvcConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {

		return new Class[] {WebMvcConfig.class};
	}

	@Override
	protected String[] getServletMappings() {

		return new String[] { "/" };
	}


}
