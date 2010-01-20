package app.controller;

import javax.faces.component.UIForm;
import javax.faces.event.PhaseEvent;
import java.util.*;
import app.model.*;

public class ShowPostController {
	private DataRepository dataRepository;
	private Page currentPost;
	private ArticlePage articlePost;
	private QuestionPage questionPost;
	private ArticleComment articleComment;
	private QuestionComment questionComment;
	private UIForm showArticleForm;
	private UIForm showQuestionForm;
	private UIForm addArticleCommentForm;
	private UIForm addQuestionCommentForm;
	
	public ShowPostController() {
		articlePost = new ArticlePage();
		questionPost = new QuestionPage();
		articleComment = new ArticleComment();
		questionComment = new QuestionComment();
		currentPost = null;
	}
	
	// used for injecting dataRepository
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	// TODO use factories to generate Pages and Comments
	public void beforePhase(PhaseEvent ev) {
		currentPost = dataRepository.getCurrentPost();
		showArticleForm.setRendered(false);
		showQuestionForm.setRendered(false);
		addArticleCommentForm.setRendered(false);
		addQuestionCommentForm.setRendered(false);
		
		if (currentPost instanceof ArticlePage) {
			articlePost = (ArticlePage) currentPost;
			showArticleForm.setRendered(true);
			addArticleCommentForm.setRendered(true);
		}
		if (currentPost instanceof QuestionPage) {
			questionPost = (QuestionPage) currentPost;
			showQuestionForm.setRendered(true);
			addQuestionCommentForm.setRendered(true);
		}
	}
	
	// TODO remove data set
	public String addComment() {
		if (currentPost instanceof ArticlePage) {
			articleComment.setPostDate(Calendar.getInstance().getTime());
			dataRepository.addComment(currentPost, articleComment);
		}
		if (currentPost instanceof QuestionPage) {
			questionComment.setPostDate(Calendar.getInstance().getTime());
			dataRepository.addComment(currentPost, questionComment);
		}
		
		return null;
	}
	
	public List<Comment> getComments() {
		return currentPost.getComments();
	}

	public ArticlePage getArticlePost() {
		return articlePost;
	}

	public void setArticlePost(ArticlePage articlePost) {
		this.articlePost = articlePost;
	}

	public QuestionPage getQuestionPost() {
		return questionPost;
	}

	public void setQuestionPost(QuestionPage questionPost) {
		this.questionPost = questionPost;
	}

	public UIForm getShowArticleForm() {
		return showArticleForm;
	}

	public void setShowArticleForm(UIForm showArticleForm) {
		this.showArticleForm = showArticleForm;
	}

	public UIForm getShowQuestionForm() {
		return showQuestionForm;
	}

	public void setShowQuestionForm(UIForm showQuestionForm) {
		this.showQuestionForm = showQuestionForm;
	}
	
	public UIForm getAddArticleCommentForm() {
		return addArticleCommentForm;
	}

	public void setAddArticleCommentForm(UIForm addArticleCommentForm) {
		this.addArticleCommentForm = addArticleCommentForm;
	}

	public UIForm getAddQuestionCommentForm() {
		return addQuestionCommentForm;
	}

	public void setAddQuestionCommentForm(UIForm addQuestionCommentForm) {
		this.addQuestionCommentForm = addQuestionCommentForm;
	}

	public DataRepository getDataRepository() {
		return dataRepository;
	}

	public Page getCurrentPost() {
		return currentPost;
	}

	public void setCurrentPost(Page currentPost) {
		this.currentPost = currentPost;
	}

	public ArticleComment getArticleComment() {
		return articleComment;
	}

	public void setArticleComment(ArticleComment articleComment) {
		this.articleComment = articleComment;
	}

	public QuestionComment getQuestionComment() {
		return questionComment;
	}

	public void setQuestionComment(QuestionComment questionComment) {
		this.questionComment = questionComment;
	}
}
