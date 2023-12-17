package HelloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gameProject.learnspringboot.game.GameRunner;
import com.gameProject.learnspringboot.game.Mario;
import com.gameProject.learnspringboot.game.SuperContra;
import com.gameProject.learnspringboot.game.Pacman;

public class HelloWorldSpring {

	public static void main(String[] args) {
		// 1. launch spring context
		// we will use tr with resources
		try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				HelloWorldConfiguration.class)) {

			// 2.Configure the things that we ant spring to manage
			// HelloWorldConfiguration- @Configuration
			// name-@Bean

			// retrieving bean
			System.out.println(context.getBean("name"));
			System.out.println(context.getBean("age"));
			System.out.println(context.getBean("person1"));
			System.out.println(context.getBean("personMethod"));
			System.out.println(context.getBean("personParameter"));
			System.out.println(context.getBean("address2"));
			System.out.println(context.getBean(Address.class));

		}

	}

}
