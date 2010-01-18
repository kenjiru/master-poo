package app.model;

/*
 * Implements the Singleton, Abstract Factory and Factory Method design patterns.
 */
public class QuestionFactory implements PostFactory {
	private static QuestionFactory questionFactory;
	
	private QuestionFactory() { }
	
	public static QuestionFactory getInstance() {
		if (questionFactory == null)
			questionFactory = new QuestionFactory();
		
		return questionFactory;
	}

	@Override
	public Page createPage() {
		return new QuestionPage();
	}
	
	@Override
	public Comment createComment() {
		return new QuestionComment();
	}

}
