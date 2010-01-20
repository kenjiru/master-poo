package app.model;

import java.util.*;

/*
 * Implements the Factory Method design patterns.
 */
public interface PostFactory {
	public Page createPage();
	public Comment createComment();
}
