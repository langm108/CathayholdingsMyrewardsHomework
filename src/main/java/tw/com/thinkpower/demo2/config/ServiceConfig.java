package tw.com.thinkpower.demo2.config;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.embedded.ConfigurableServletWebServerFactory;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import tw.com.thinkpower.demo2.provider.CORSFilter;


@Configuration
public class ServiceConfig {
	
	private static final Logger logger = LoggerFactory.getLogger(ServiceConfig.class);
	
//	@Autowired 
//	protected ServiceProperties serviceProperties;
	

	//	@Bean
//	public EmbeddedServletContainerCustomizer getEmbeddedServletContainerCustomizer(){
//		return new EmbeddedServletContainerCustomizer(){
//
//			@Override
//			public void customize(ConfigurableServletWebServerFactory container) {
//				container.setPort(serviceProperties.getPort());
//			}
//			
//		};
//	}
	
	@Bean
	public FilterRegistrationBean<CORSFilter> someFilterRegistration(){
		
//		logger.info("");
		FilterRegistrationBean<CORSFilter> registration = new FilterRegistrationBean<CORSFilter>();
		registration.setFilter(new CORSFilter());
		registration.addUrlPatterns("/*");
		return registration;
	}
}
