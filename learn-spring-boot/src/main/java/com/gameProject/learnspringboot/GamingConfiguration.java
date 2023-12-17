package com.gameProject.learnspringboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gameProject.learnspringboot.game.Pacman;
import com.gameProject.learnspringboot.game.GameRunner;
import com.gameProject.learnspringboot.game.GamingConsole;

@Configuration
public class GamingConfiguration {

	@Bean
	public GamingConsole game()
	{
		Pacman pacman=new Pacman();
		return pacman;
	}
	
	@Bean
	public GameRunner gamerunner(GamingConsole game)
	{
//		return new GameRunner(game());
		return new GameRunner(game);
	}
}
