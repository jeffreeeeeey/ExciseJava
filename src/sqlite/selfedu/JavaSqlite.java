package sqlite.selfedu;

import java.sql.*;
import org.sqlite.JDBC;

public class JavaSqlite {
	public static void main(String[] args) {
		InitApp app = new InitApp();
		//app.initDatabase();
		app.initInterface();
		
		/*
		SelectWords selectWords = new SelectWords();
		selectWords.showWords();
		int wordID = 10;
		selectWords.showWordDetails(wordID);
		*/
	}
}
