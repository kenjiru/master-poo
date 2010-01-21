package app.model;

import java.util.Calendar;

/*
 * Implements the Singleton, Abstract Factory and Factory Method design patterns.
 */
public class QuestionFactory implements PostFactory {
	private static QuestionFactory questionFactory;
	public QuestionPageBuilder questionBuilder;
	
	private QuestionFactory() { 
	}
	
	
	public static QuestionFactory getInstance() {
		if (questionFactory == null)
			questionFactory = new QuestionFactory();
		
		return questionFactory;
	}
	
	public Page createPage() {
		questionBuilder.buildQuestion();
		questionBuilder.buildAuthor("Question Author");
		questionBuilder.buildContent("Question Content");
		questionBuilder.buildTitle("Question Title");
		questionBuilder.buildPostDate(Calendar.getInstance().getTime());
		
		return questionBuilder.getQuestion();
	}
	
	@Override
	public Comment createComment() {
		return new QuestionComment();
	}

}
