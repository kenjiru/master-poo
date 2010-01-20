package app.model;

import java.util.*;

public class ArticlePageBuilder implements PageBuilder{
	protected ArticlePage article;
	
	public void buildArticle() {
		article = new ArticlePage();
	}
	
	public void buildAuthor(String author) {
		article.setAuthor(author);
	}
	public void buildTitle(String title) {
		article.setTitle(title);
	}
	public void buildContent(String content) {
		article.setContent(content);
	}
	public void buildPostDate(Date date) {
		article.setPostDate(date);
	}
	
	public void buildSummary(String summary) {
		article.setSummary(summary);
	}
	
	public ArticlePage getArticle() {
		return article;
	}
}
