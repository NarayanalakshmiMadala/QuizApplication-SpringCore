package com.learning.main;
import com.learning.beans.StartQuiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchQuizApp {

	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml"); 
	    StartQuiz sq=context.getBean("sq",StartQuiz.class);
	    sq.start();
	    
	}

}