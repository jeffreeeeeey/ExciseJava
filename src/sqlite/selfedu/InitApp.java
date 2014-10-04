package sqlite.selfedu;
import java.awt.*;

import javax.swing.*;

import java.sql.*;
import java.util.ArrayList;

public class InitApp {
	public void initDatabase(){
		try {
			Class.forName("org.sqlite.JDBC");
			// ����һ�����ݿ���database.db�����ӣ���������ھ��ڵ�ǰĿ¼�´���֮  
			  
            Connection conn = DriverManager  
                    .getConnection("jdbc:sqlite:database.db");  
            Statement stat = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            stat.executeUpdate("create table IF NOT EXISTS Words_table ( id integer primary key, word text, PLA text);");
            //stat.executeUpdate("create table Words("
            		//+ "id integer primary key,"
            		//+ "word text not null collate,"
            		//+ "PLA text);");// �������ʱ�
            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Meanings_table("
            		+ "id INTEGER PRIMARY KEY,"
            		+ "meaning text not null);");
            stat.executeUpdate("CREATE TABLE IF NOT EXISTS Words_Meanings_table("
            		+ "id integer primary key,"
            		+ "wordID integer not null,"
            		+ "meaningID integer not null);");
            
            /*
            stat.executeUpdate("CREATE TABLE Property_table("
            		+ "id integer primary key,"
            		+ "propertyName text not null collate nocase);");//�������Ա�
            */
            
            /*
             * Insert some data;
            stat.executeUpdate("insert into Words_table (word, PLA) values('collate','collatePLA');"); // ��������  
            
            ResultSet rs = stat.executeQuery("select * from Words_table WHERE id = (SELECT MAX(id) FROM Words_table);"); // ��ѯ���µ�һ������  
            //rs.last();
            int wordID = rs.getInt("id");
            
            stat.executeUpdate("INSERT INTO Meanings_table (meaning) VALUES('to gether information together, examine it carefully, and compare it with other information to find differences.')");
            rs = stat.executeQuery("SELECT * FROM Meanings_table WHERE id = (SELECT MAX(id) FROM Meanings_table);");
            //rs.last();
            int meaningID = rs.getInt("id");
            
            stat.executeUpdate("INSERT INTO Words_Meanings_table (wordID, meaningID) VALUES(" + wordID + "," + meaningID + ")");
            
            rs.close();  
            */
            conn.close(); // �������ݿ������  
		} catch (Exception e) {
			e.printStackTrace();
		}
	}//end of initDatabase
	
	public void initInterface(){
		JFrame app = new JFrame("Words 3000");
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		app.setSize(400, 500);
		Container container = app.getContentPane();
		container.setLayout(new BorderLayout());
		
		//Add banner panel
		JPanel bannerPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		JLabel nameLabel = new JLabel("Words 3000");
		bannerPanel.add(nameLabel);
		container.add(bannerPanel, BorderLayout.NORTH);
		
		//Add words list
		JPanel wordsListPanel = new JPanel();
		wordsListPanel.setLayout(new BoxLayout(wordsListPanel, BoxLayout.Y_AXIS));
		
		SelectWords selectWords = new SelectWords();
		ArrayList<Word> wordsList = selectWords.getWords();
		
		for (int i = 0; i < wordsList.size(); i++) {
			Word word = (Word)wordsList.get(i);
			String name = word.name;
			JLabel wordLabel = new JLabel(name);
			wordsListPanel.add(wordLabel);
		}
		
		
		container.add(wordsListPanel, BorderLayout.CENTER);
		
		app.setVisible(true);
	}
}
