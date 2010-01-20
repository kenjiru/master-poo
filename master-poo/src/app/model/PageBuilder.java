package app.model;

import java.util.*;

public interface PageBuilder {
	
	void buildAuthor(String author);
	void buildTitle(String title);
	void buildContent(String content);
	void buildPostDate(Date date);

}
