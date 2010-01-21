package app.model;

import java.text.SimpleDateFormat;
import java.util.*;

/*
 * Implements the Singleton, Abstract Factory and Factory Method design patterns.
 */
public class ArticleFactory implements PostFactory {
	private static ArticleFactory articleFactory;
	private ArticlePageBuilder articleBuilder;
	
	private ArticleFactory() { 
		articleBuilder = new ArticlePageBuilder();
	}
	
	public static ArticleFactory getInstance() {
		if (articleFactory == null)
			articleFactory = new ArticleFactory();
		
		return articleFactory;
	}
	
	public void setArticlePageBuilder(ArticlePageBuilder articleBuilder) {
		this.articleBuilder = articleBuilder;
	}

	public Page createPage() {
		articleBuilder.buildArticle();
		articleBuilder.buildAuthor("Article Author");
		articleBuilder.buildContent("Article Content");
		articleBuilder.buildTitle("Article Title");
		articleBuilder.buildPostDate(Calendar.getInstance().getTime());
		articleBuilder.buildSummary("No summary yet.");
		
		return articleBuilder.getArticle();
	}
	
	
	@Override
	public Comment createComment() {
		return new ArticleComment();
	}

}
