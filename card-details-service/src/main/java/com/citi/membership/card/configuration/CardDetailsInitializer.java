package com.citi.membership.card.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class CardDetailsInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


	protected Class<?>[] getRootConfigClasses() {

		return new Class[] {CardDetailsConfiguration.class};
	}


	protected Class<?>[] getServletConfigClasses() {

		return null;
	}


	protected String[] getServletMappings() {
	
		return new String[] {"/"};
	}
	
	

}
