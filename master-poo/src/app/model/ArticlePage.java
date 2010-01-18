package app.model;

import java.util.*;

/*
 * Particular things:
 * - handles large page content (it doesn't use String for content)
 * - has a content summary
 * - saves the date for last content & title update
 */
public class ArticlePage extends Page {
	String summary;
	Date lastUpdate;
	
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public Date getLastUpdate() {
		return lastUpdate;
	}
	
	// saves the date of the update
	@Override
	public void setContent(String content) {
		super.setContent(content);
		
		if (postDate != null) 
			lastUpdate = new Date();
	}
	
	// saves the date of the update
	@Override
	public void setTitle(String title) {
		super.setTitle(title);
		
		if (postDate != null) 
			lastUpdate = new Date();
	}
}
