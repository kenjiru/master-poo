package app.model;

import java.util.*;

public abstract class Page {
	int id;
	String author;
	String title;
	String content;
	Date postDate;
	List<Comment> comments;
	
	public Page() {
		comments = new ArrayList<Comment>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPostDate() {
		return postDate;
	}
	public void setPostDate(Date postDate) {
		this.postDate = postDate;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
}
