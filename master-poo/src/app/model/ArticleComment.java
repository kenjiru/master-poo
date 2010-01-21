package app.model;

public class ArticleComment extends Comment {
	
	public ArticleComment() { }
	
	public ArticleComment(Comment comment) {
		comment.clone();
	}

}
