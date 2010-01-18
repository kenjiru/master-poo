package app.model;

/*
 * Implements the Factory Method design patterns.
 */
public interface PostFactory {
	public Page createPage();
	public Comment createComment();
}
