package com.learning.beans;

public class Questions
{
    private String question;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    
    public Questions(String question, String option1, String option2, String option3, String option4) {
        this.question = question;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
    }

	@Override
	public String toString() {
		return question + 
				"\n" + option1 + 
				"\n" + option2 + 
				"\n" + option3 + 
				"\n" + option4 ;
	}
     
}