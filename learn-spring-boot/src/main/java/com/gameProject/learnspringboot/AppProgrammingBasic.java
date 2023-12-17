package com.gameProject.learnspringboot;

import com.gameProject.learnspringboot.game.GameRunner;
import com.gameProject.learnspringboot.game.Mario;
import com.gameProject.learnspringboot.game.SuperContra;
import com.gameProject.learnspringboot.game.Pacman;

public class AppProgrammingBasic {

	public static void main(String[] args) {
		
		//creating objects
//		Mario game=new Mario();
//		SuperContra game=new SuperContra();
		Pacman game =new Pacman();
		
		
		GameRunner gameRunner=new GameRunner(game);
		//object creation + wiring of depenecies
		//Game is Depenecy of GameRunner
		//we are inection or wring depenecy
		
		gameRunner.run();
		
	}

}
