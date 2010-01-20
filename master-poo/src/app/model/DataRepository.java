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
}
