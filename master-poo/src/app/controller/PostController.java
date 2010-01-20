package app.controller;

import java.util.*;
import app.model.*;

public class PostController {
	private DataRepository dataRepository;
	
	// used for injecting
	public void setDataRepository(DataRepository dataRepository) {
		this.dataRepository = dataRepository;
	}

	public List<Page> getPosts() {
		return dataRepository.getPosts();
	}
}
