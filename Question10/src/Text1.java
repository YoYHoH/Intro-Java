import java.util.*;
public class Text1 {
	public enum Day{SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FEIDAY,SATURDAY}
	public enum Mood{SOSO,SAD,HAPPY}
	Scanner input=new Scanner(System.in);
	private Day day;
	public Text1(){
		switch(input.nextInt()){
		case 1:this.day=Day.MONDAY;break;
		case 2:this.day=Day.TUESDAY;break;
		
		}
	}
	public void moodofDay(){
		
	}
	public static void main(String[] args){
		
	}

}
