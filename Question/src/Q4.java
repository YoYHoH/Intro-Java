import java.util.Scanner;
public class Q4 {
	public static void main(String[]args){
		System.out.println("Enter the number of minutes : ");
		Scanner input=new Scanner(System.in);
		int min=input.nextInt();
		int year=min/60/24/365;
		int day=(min-year*365*24*60)/60/24;
		System.out.printf(min + " minutes is apporximately " + year +" years and " + day +" days.");
		input.close();
	}
}
