package app.model;

import java.util.*;

public class DataRepository {
	private List<Page> posts;
	
	public DataRepository() {
		posts = new ArrayList<Page>();
		
		ArticleFactory articleFactory = ArticleFactory.getInstance();
		QuestionFactory questionFactory = QuestionFactory.getInstance();
		
		ArticlePage articlePage = (ArticlePage) articleFactory.createPage();
		articlePage.setTitle("Change user password in Ubuntu");
		articlePage.setAuthor("John Weldon");
		articlePage.setContent("This article will show how to change your password in Ubuntu.");
		articlePage.setSummary("No summary");
		articlePage.setPostDate(new Date(2009,1,19));
		
		
		QuestionPage questionPage = (QuestionPage) questionFactory.createPage();
		questionPage.setTitle("How to change desktop background in Gnome?");
		questionPage.setAuthor("Justin Smith");
		questionPage.setContent("How do I change the background image of the desktop in Gnome?");
		questionPage.setPostDate(new Date(2009,1,17));
		
		posts.add(articlePage);
		posts.add(questionPage);
	}
	
	public List<Page> getPosts() {
		return posts;
	}
}
