package tw.com.thinkpower.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//@SpringBootApplication
@Configuration
@ComponentScan
@EnableAutoConfiguration
@PropertySource(value="${spring.config.location:classpath:application.yml}")
@EnableJpaRepositories(basePackages = {
		"tw.com.thinkpower.demo2.repository"
})
@EntityScan(basePackages = {
		"tw.com.thinkpower.demo2.model"
})
@EnableTransactionManagement
public class Demo2Application {

	
	// https://crunchify.com/simplest-spring-mvc-hello-world-example-tutorial-spring-model-view-controller-tips/
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
