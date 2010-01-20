package app.model;

import java.io.*;
import java.net.URL;
import java.util.*;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class DataRepository {
	private List<Page> posts;
	private String fileName;
	
	public DataRepository() {
		fileName = "data.xml";
		
		URL fileUrl = this.getClass().getResource(fileName);

		try {
			FileInputStream fos = new FileInputStream(fileUrl.getPath());
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
	
	public void commit() {
		URL fileUrl = this.getClass().getResource(fileName);

		try {
			FileOutputStream fos = new FileOutputStream(fileUrl.getPath());
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
	
	public List<Page> getPosts() {
		return posts;
	}
	
	public void generateEntries() {
		ArticleFactory articleFactory = ArticleFactory.getInstance();
		QuestionFactory questionFactory = QuestionFactory.getInstance();
		
		ArticlePage articlePage = (ArticlePage) articleFactory.createPage();
		articlePage.setTitle("Change user password in Ubuntu");
		articlePage.setAuthor("John Weldon");
		articlePage.setContent("This article will show how to change your password in Ubuntu.");
		articlePage.setSummary("No summary");
		articlePage.setPostDate(new Date(2009,1,19));
		
		ArticleComment articleComment1 = (ArticleComment) articleFactory.createComment();
		articleComment1.setAuthor("Jonny Deep");
		articleComment1.setContent("Nice article you have there!");
		articleComment1.setPostDate(new Date(2009,1,24));
		
		ArticleComment articleComment2 = (ArticleComment) articleFactory.createComment();
		articleComment2.setAuthor("Billy Bill");
		articleComment2.setContent("I don't like it!");
		articleComment2.setPostDate(new Date(2009,1,24));
		
		articlePage.addComment(articleComment1);
		articlePage.addComment(articleComment2);
		
		QuestionPage questionPage = (QuestionPage) questionFactory.createPage();
		questionPage.setTitle("How to change desktop background in Gnome?");
		questionPage.setAuthor("Justin Smith");
		questionPage.setContent("How do I change the background image of the desktop in Gnome?");
		questionPage.setPostDate(new Date(2009,1,17));
		
		QuestionComment questionComment1 = (QuestionComment) questionFactory.createComment();
		questionComment1.setAuthor("Miky Mouse");
		questionComment1.setContent("I don't know, don't ask me!");
		questionComment1.setPostDate(new Date(2009,2,3));
		
		QuestionComment questionComment2 = (QuestionComment) questionFactory.createComment();
		questionComment2.setAuthor("Miky Mouse");
		questionComment2.setContent("I think you should try this aproach!");
		questionComment2.setPostDate(new Date(2009,2,16));
		
		questionPage.addComment(questionComment1);
		questionPage.addComment(questionComment2);
		
		posts.add(articlePage);
		posts.add(questionPage);
	}
}
