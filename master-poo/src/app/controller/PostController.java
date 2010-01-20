package app.controller;

import javax.faces.component.UIForm;
import javax.faces.event.ActionEvent;
import java.util.*;
import app.model.*;

public class PostController {
	private DataRepository dataRepository;
	private Page selectedPost;
	private UIForm listPostsForm;
	
	// used for injecting dataRepository
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}
	
	public String view() {
		listPostsForm.setRendered(false);
		
		return "view";
	}
	
	public void view2(ActionEvent ae) {
		
	}

	public List<Page> getPosts() {
		return dataRepository.getPosts();
	}

	public Page getSelectedPost() {
		return selectedPost;
	}

	public void setSelectedPost(Page selectedPost) {
		this.selectedPost = selectedPost;
	}

	public UIForm getListPostsForm() {
		return listPostsForm;
	}

	public void setListPostsForm(UIForm listPostsForm) {
		this.listPostsForm = listPostsForm;
	}
}
