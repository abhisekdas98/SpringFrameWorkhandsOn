package com.in28minutes.spring.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole{
	
	public void up()
	{
		System.out.println("Mario UP");
	}
	
	public void down()
	{
		System.out.println("Mario DOWN");
	}
	
	public void right()
	{
		System.out.println("Mario RIGHT");
	}
	
	public void left()
	{
		System.out.println("Mario LEFT");
	}

}
