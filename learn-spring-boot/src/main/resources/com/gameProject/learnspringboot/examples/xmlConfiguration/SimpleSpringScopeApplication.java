package com.gameProject.learnspringboot.examples.xmlConfiguration;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


//@Configuration
//@ComponentScan
public class SimpleSpringScopeApplication {

	public static void main(String[] args) {
		// launch application context

		try (var context=new ClassPathXmlApplicationContext("ContextConfiguration.xml") ){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			

		}
	}

}
