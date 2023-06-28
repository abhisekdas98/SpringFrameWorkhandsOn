package com.in28minutes.spring.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.spring.learnspringframework.enterprice.example.MyWebController;
import com.in28minutes.spring.learnspringframework.game.GameRunner;


@SpringBootApplication
@ComponentScan("com.in28minutes.spring.learnspringframework")
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		//GamingConsole game=new MarioGame(); //1
		
		//GameRunner runner=new GameRunner(game); //2
		
		
		GameRunner runner=context.getBean(GameRunner.class);
		
		runner.run();
		
		MyWebController mwc=context.getBean(MyWebController.class);
		
		System.out.println(mwc.returnValueFromBusinessService());
		
	}
	

}
