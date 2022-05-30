import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
public class Q2 {
	public static void main(String[]args){
		GregorianCalendar gc=new GregorianCalendar();
		SimpleDateFormat s=new SimpleDateFormat("MM-dd-yyyy");
		int y=gc.get(GregorianCalendar.YEAR);
		int m=gc.get(GregorianCalendar.MONTH)+1;
		int d=gc.get(GregorianCalendar.DAY_OF_MONTH);
		gc.setTimeInMillis(1234567898765L);
		System.out.println("Current year, month, and day in format Mth/Day/Year:"+m+"/"+d+"/"+y);
		System.out.println("Elapsed time since January 1, 1970 set to 1234667898765L in format Mat/Day/Year: "+s.format(gc.getTime()));
	}
}
