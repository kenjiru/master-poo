package app.controller;

import javax.faces.component.UIForm;
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
	
	public String showPost() {
		return "show";
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
