package com.gameProject.learnspringboot;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gameProject.learnspringboot.game.GameRunner;
import com.gameProject.learnspringboot.game.GamingConsole;




public class AppProgrammingBasicSpringBeans {

	public static void main(String []args)
	{
		//luanch application cntext
		
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			System.out.println(context.getBean("game"));
			//call method using bean
			
			context.getBean(GamingConsole.class).up();
			
			//call gamerunner class
			
			context.getBean(GameRunner.class).run();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
