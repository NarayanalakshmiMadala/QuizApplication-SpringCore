package com.learning.beans;
import java.util.List;
import java.util.Scanner;
 

public class StartQuiz
{
    private List<Questions> questions;
    private char[] answers={'4','2','4','3','1'};
    private int score=0;
    private Scanner scanner;
    
	public StartQuiz(List<Questions> questions) 
	{
		super();
		this.questions = questions;
	}
     
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}

	public void start() 
	{
		System.out.println("=========================================================");
        System.out.println("\t\tQuiz Application");
        System.out.println("=========================================================");
        System.out.println("Time will be 10 Seconds To each Question");
        System.out.println("Score is calculated\nCorrect Answer (+2) Wrong Answer (-1) Skip (0)");
        System.out.println("----------------------------------------");
        playQuiz();
		
	}
	
	public void playQuiz()
    { 
        int i=0;
        dispQuestions(i);
    }
    public void dispQuestions(int i)
    {
        char userans;
        while(i<questions.size())
        {
            System.out.println("Question : "+(i+1));
            System.out.println(questions.get(i));
            while(true)
            {
                System.out.print("\nDo You Want to Skip The Question (Y/N):");
                char skip=scanner.next().charAt(0);
                if(skip=='n'||skip=='N')
                {
                	break;
                }
                else
                {
                    i++;
                    dispQuestions(i);
                }
            }
            long start_time=System.currentTimeMillis();
            long end=start_time+10000;
            System.out.print("\nPlayer Ans :");
            userans=scanner.next().charAt(0);
            int status=0;
            long playeranstime=System.currentTimeMillis();
            if(playeranstime<end)
            {
                if(userans==answers[i])
                    status=1;
                else  
                    status=2;
            }
            if(status==1)
            {
                this.score+=2; 
                System.out.println("\n\tRight Answer ");
                System.out.println("\tScore : "+this.score);
                System.out.println("----------------------------------------");
                i++;
            }     
            else if(status==2)
            {
                this.score+=-1; 
                System.out.println("\n\tWrong Answer\n\tCorrect Answer is : "+answers[i]);
                System.out.println("\tScore : "+this.score);
                System.out.println("----------------------------------------");
                i++;
            }
            else if(status==0)
            {
                System.out.println("Sorry Timed Out " );  
                System.out.println("----------------------------------------"); 
                i++;
            } 
        }  
        System.out.println("Total Score Obtained :"+this.score+"/10");
        if(this.score > 0)
            System.out.println("Percentage           : "+(this.score*100/10)+"%");     
        else if(this.score<=0)
            System.out.println("Percentage         : 0%");
        System.out.println("-----------------------------------------");
        System.out.println("Thanks For Using Quiz Application\nHave A Wonderful day");
        System.out.println("-----------------------------------------");
        System.exit(0);      
    }   
}