import java.util.*;
public class myTime {
	private int hour,minute,second;
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	GregorianCalendar gc=new GregorianCalendar();
	myTime(){
		this.hour=gc.get(GregorianCalendar.HOUR_OF_DAY);
		this.minute=gc.get(GregorianCalendar.MINUTE);
		this.second=gc.get(GregorianCalendar.SECOND);
	}
	myTime(int h,int m,int s){
		if(h<0||h>23||m<0||m>59||s<0||s>59) System.out.println("Input is wrong"); 
		this.hour=h;
		this.minute=m;
		this.second=s;
	}
	public String toString() {
		return hour+":"+minute+":"+second;
	}
	public String timeDifference() {
		int hour2;
		int minute2;
		int second2;
		Calendar calendar=Calendar.getInstance();
		int hour1 = calendar.get(Calendar.HOUR_OF_DAY);
		int minute1 = calendar.get(Calendar.MINUTE);
		int second1 = calendar.get(Calendar.SECOND);
		if (hour1<hour) 
			hour1 = hour1 + 24;	
		if (second1 >= second)
			second2 = second1 - second;
		else {
			second2 = second1 - second + 60;
			minute1 = minute1 - 1;
		}
		if (minute1 >= minute)
			minute2 = minute1 - minute;
		else {
			minute2 = minute1 - minute + 60;
			hour1 = hour1 - 1;
		}
			hour2 = hour1 - hour;
		return hour2 + ":" + minute2 + ":" + second2;
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in );
		myTime time1=new myTime(input.nextInt(),input.nextInt(),input.nextInt());
		myTime time2=new myTime();
		System.out .println("current time "+time2);
		System.out .println("input time "+time1);
		System.out .println("difference "+time1.timeDifference());
		}

}
