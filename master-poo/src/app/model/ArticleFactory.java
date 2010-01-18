package app.model;

/*
 * Implements the Singleton, Abstract Factory and Factory Method design patterns.
 */
public class ArticleFactory implements PostFactory {
	private static ArticleFactory articleFactory;
	
	private ArticleFactory() { }
	
	public static ArticleFactory getInstance() {
		if (articleFactory == null)
			articleFactory = new ArticleFactory();
		
		return articleFactory;
	}

	@Override
	public Page createPage() {
		return new ArticlePage();
	}
	
	@Override
	public Comment createComment() {
		return new ArticleComment();
	}

}
