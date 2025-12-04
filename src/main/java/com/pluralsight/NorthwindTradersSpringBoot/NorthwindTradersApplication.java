package com.pluralsight.NorthwindTradersSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class NorthwindTradersApplication {

	public static void main(String[] args) {
		ApplicationContext ac =SpringApplication.run(NorthwindTradersApplication.class, args);
        System.out.println("------------------------");
        for (String s : ac.getBeanDefinitionNames()) {
            System.out.println(s);
        }
	}

}
