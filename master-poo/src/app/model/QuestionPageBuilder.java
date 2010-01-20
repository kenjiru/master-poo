package app.model;

import java.util.Date;

public class QuestionPageBuilder implements PageBuilder{
	
	QuestionPage question;
	
	public void buildQuestion() {
		question = new QuestionPage();
	}
	
	public void buildAuthor(String author) {
		question.setAuthor(author);
	}
	public void buildTitle(String title) {
		question.setTitle(title);
	}
	public void buildContent(String content) {
		question.setContent(content);
	}
	public void buildPostDate(Date date) {
		question.setPostDate(date);
	}
	
	public QuestionPage getQuestion() {
		return question;
	}

}
