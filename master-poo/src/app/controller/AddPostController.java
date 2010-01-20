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
}
