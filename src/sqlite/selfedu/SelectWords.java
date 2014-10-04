package sqlite.selfedu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SelectWords {
	public ArrayList<Word> getWords(){
		ArrayList<Word> wordList = new ArrayList<Word>();
		try {
			Class.forName("org.sqlite.JDBC");
			// 建立一个数据库名database.db的连接，如果不存在就在当前目录下创建之  
			  
            Connection conn = DriverManager  
                    .getConnection("jdbc:sqlite:database.db");  
            Statement stat = conn.createStatement();
            
            ResultSet rs = stat.executeQuery("select * from Words_table;");
            
            
            while (rs.next()) { // 将查询到的数据打印出来  
            	int id = rs.getInt("id");
            	String name = rs.getString("word");
            	
            	Word word = new Word(id, name);
            	wordList.add(word);
            	
            	//System.out.print(rs.getString("id") + " ");
                //System.out.println("word = " + rs.getString("word") + ","); // 列属性一  
                //System.out.println("PLA = " + rs.getString("PLA")); // 列属性二  
            }
            System.out.println("found " + wordList.size() + " words");
            
            stat.close();
            rs.close();
            conn.close();
            
            return wordList;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return wordList;
	}// End of showWords
	
	public void showWordDetails(int wordID){
		try {
			Class.forName("org.sqlite.JDBC");
			// 建立一个数据库名database.db的连接，如果不存在就在当前目录下创建之  
			  
            Connection conn = DriverManager  
                    .getConnection("jdbc:sqlite:database.db");  
            Statement stat = conn.createStatement();
            
            ResultSet rs = stat.executeQuery("select * from Words_table WHERE id =" + wordID + ";");
            System.out.println("the word is:" + rs.getString("word"));
            System.out.println("PLA:" + rs.getString("PLA"));
            rs = stat.executeQuery("SELECT * FROM Words_Meanings_table WHERE wordID = " + wordID +";");
            while (rs.next()) {
				//System.out.println(rs.getString("wordID") + "-" + rs.getString("meaningID"));
				int meaningID = rs.getInt("meaningID");
				rs = stat.executeQuery("SELECT * FROM Meanings_table WHERE id = " + meaningID + ";");
	            while (rs.next()) {
					System.out.println("meaning:" + rs.getString("meaning"));
				}
			}
            stat.close();
            rs.close();
            conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
