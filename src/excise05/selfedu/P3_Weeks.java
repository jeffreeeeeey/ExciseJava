package excise05.selfedu;

import javax.swing.text.StyledEditorKit.ForegroundAction;

enum WEEKDAY{
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday; 
}

public class P3_Weeks {
	public static void main(String[] args) {
		WEEKDAY [] weekDays = WEEKDAY.values();
		for(WEEKDAY day:weekDays){
			System.out.println(day);
		}
	}
	
}
