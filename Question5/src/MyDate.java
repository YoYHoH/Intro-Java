import java.util.GregorianCalendar;
public class MyDate {
	private int year;
	private int month;
	private int day;
	public String s1,s2;
	GregorianCalendar gc=new GregorianCalendar();
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public  String Mydate(){
		 year=gc.get(GregorianCalendar.YEAR);
		 month=gc.get(GregorianCalendar.MONTH)+1;
		 day=gc.get(GregorianCalendar.DAY_OF_MONTH);
		 return s1="Date1: "+day+"/"+month+"/"+year;
	}
	public String setDate(long l){
		gc.setTimeInMillis(l);
		year=gc.get(GregorianCalendar.YEAR);
		month=gc.get(GregorianCalendar.MONTH)+1;
		day=gc.get(GregorianCalendar.DAY_OF_MONTH);
		return s2="Date2: "+day+"/"+month+"/"+year;
	}

}
