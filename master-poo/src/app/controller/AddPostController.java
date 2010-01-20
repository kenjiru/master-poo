package app.controller;

import javax.faces.component.UIForm;
import javax.faces.event.ActionEvent;
import javax.faces.event.PhaseEvent;

import app.model.*;

public class AddPostController {
	private DataRepository dataRepository;
	private String postType;
	private UIForm addArticleForm;
	private UIForm addQuestionForm;
	private ArticlePage articlePage;
	private QuestionPage questionPage;
	
	public AddPostController() {
		articlePage = new ArticlePage();
		questionPage = new QuestionPage();
		postType = "none";
	}
	
	public void beforePhase(PhaseEvent ev) {
		addArticleForm.setRendered(false);
		addQuestionForm.setRendered(false);
		
		if(postType.equals("Article")) {
			addArticleForm.setRendered(true);
		}
		if(postType.equals("Question")) {
			addQuestionForm.setRendered(true);
		}
	}
	
	// used for injecting dataRepository
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public void add(ActionEvent event) {
		postType = (String) event.getComponent().getAttributes().get("postType");
	}
	
	public String addArticle() {
		dataRepository.addPost(articlePage);
		
		return null;
	}
	
	public String addQuestion() {
		dataRepository.addPost(questionPage);
		
		return null;
	}

	public String getAddAttribute() {
		return postType;
	}

	public void setAddAttribute(String postType) {
		this.postType = postType;
	}

	public UIForm getAddQuestionForm() {
		return addQuestionForm;
	}

	public void setAddQuestionForm(UIForm addQuestionForm) {
		this.addQuestionForm = addQuestionForm;
	}

	public UIForm getAddArticleForm() {
		return addArticleForm;
	}

	public void setAddArticleForm(UIForm addArticleForm) {
		this.addArticleForm = addArticleForm;
	}

	public ArticlePage getArticlePage() {
		return articlePage;
	}

	public void setArticlePage(ArticlePage articlePage) {
		this.articlePage = articlePage;
	}

	public QuestionPage getQuestionPage() {
		return questionPage;
	}

	public void setQuestionPage(QuestionPage questionPage) {
		this.questionPage = questionPage;
	}
}
