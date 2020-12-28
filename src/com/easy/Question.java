package com.easy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question implements Comparable<Question> {
	public String questionNumber;
    public String title;
    public String description;
    
	public Question (String questionNumber, String title, String description) {
		this.questionNumber = questionNumber;
		this.title = title;
		this.description = description;
	}
	
	public String getQuestionNumber() {
		return questionNumber;
	}

	@Override
	public int compareTo(Question question) {
		String questionNumber = question.getQuestionNumber();
		
		int compareTo = ((Integer)Integer.parseInt(this.getQuestionNumber().split("\\.")[0])).compareTo((Integer)Integer.parseInt(questionNumber.split("\\.")[0]));
		
		if(compareTo != 0 ){
			return compareTo;
		} else {
			return ((Integer)Integer.parseInt(this.getQuestionNumber().split("\\.")[1])).compareTo((Integer)Integer.parseInt(questionNumber.split("\\.")[1]));
		}
		
	}

	@Override
	public String toString() {
		return "Question [questionNumber=" + questionNumber + ", title=" + title + ", description=" + description + "]";
	}

	public static void main(String[] args) {
    	
    	List<Question> questionList = new ArrayList<Question>();

    	questionList.add(new Question("12.2", "titleA", "titleA_Desc"));
    	questionList.add(new Question("12.1", "titleB", "titleB_Desc"));
    	questionList.add(new Question("12.3", "titleC", "titleC_Desc"));
    	questionList.add(new Question("12.10", "titleD", "titleD_Desc"));
    	questionList.add(new Question("12.4", "titleE", "titleE_Desc"));
    	
    	Collections.sort(questionList);
    	
    	for (Question question : questionList) {
			System.out.println(question);
		}
	}
}
