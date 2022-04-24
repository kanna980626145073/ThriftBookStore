package com.bookstore.ThriftBookStore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.bookstore")
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class ThriftBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThriftBookStoreApplication.class, args);
	}

}
