package org.dteja.ShoppingBackEnd;

import org.dteja.config.DBConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

/**
 * Hello world!
 *
 */
@Configuration
public class App {

	@Autowired
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfiguration.class);
		((AnnotationConfigApplicationContext) context).close();
	}
}
