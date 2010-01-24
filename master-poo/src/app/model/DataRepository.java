package app.model;

import java.io.*;
import java.net.URL;
import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class DataRepository {
	private List<Page> posts;
	private String filePath;
	private Page currentPost;
	
	public DataRepository() {
		URL fileUrl = this.getClass().getResource("data.xml");
		filePath = fileUrl.getPath();

		try {
			FileInputStream fos = new FileInputStream(filePath);
			XStream xtream = new XStream(new DomDriver());
			posts = (ArrayList<Page>) xtream.fromXML(fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void persist() {
		try {
			FileOutputStream fos = new FileOutputStream(filePath);
			XStream xtream = new XStream(new DomDriver());
			xtream.toXML(posts, fos);
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void addPost(Page post) {
		posts.add(post);
		
		persist();
	}
	
	public void addComment(Page post, Comment comment) {
		posts.get(posts.indexOf(post)).addComment(comment);
		
		persist();
	}
	
	public List<Page> getPosts() {
		return posts;
	}

	public Page getCurrentPost() {
		return currentPost;
	}

	public void setCurrentPost(Page currentPost) {
		this.currentPost = currentPost;
	}
}
