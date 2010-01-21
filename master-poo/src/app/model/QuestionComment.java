package app.model;

public class QuestionComment extends Comment {
	private String title;
	
	public QuestionComment() { }

	public QuestionComment(String title) {
		super.clone();
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
		
		QuestionComment questionComment = new QuestionComment("New Title");
		questionComment.setAuthor(author);
		questionComment.setContent(content);
	}
	
}
