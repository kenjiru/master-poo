package app;

import java.io.*;

import app.model.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArticleFactory articleFactory = ArticleFactory.getInstance();
		QuestionFactory questionFactory = QuestionFactory.getInstance();
		boolean exitFlag = false;

		System.out.println("Enter the post type you want to create or X to exit.");
		try {
			do {
				String line;
				char c = ' ';
				
				System.out.println("Article, Question or Exit (A/Q/X): ");
				line = br.readLine();
				
				if (line.length() > 0)
					c = line.toUpperCase().charAt(0);
				
				switch (c) {
				case 'A':
					System.out.println("Article!");
					articleFactory.createPage();
					break;
				case 'Q':
					System.out.println("Question!");
					break;
				case 'X':
					System.out.println("Exit!");
					System.exit(0);
					break;
				}
			} while (exitFlag == false);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
