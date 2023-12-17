package com.gameProject.learnspringboot.game;

public class Mario implements GamingConsole{

	public void up()
	{
		System.out.println("jump");
	}
	
	public void down()
	{
		System.out.println("Go into hole");
	}
	
	public void left()
	{
		System.out.println("Go back");
	}
	
	public void right()
	{
		System.out.println("Accelarate");
	}
}
