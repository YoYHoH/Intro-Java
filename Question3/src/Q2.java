import java.util.Scanner;
public class Q2 {
	public static void main(String[]args){
		System.out.println("Enter a point with two coordinates:");
		Scanner input=new Scanner(System.in);
		double x=input.nextDouble(),y=input.nextDouble();
		input.close();
		double d=Math.sqrt(x*x+y*y);
		if (d>10){
			System.out.println("Point ("+x+","+y+") is not in the circle");
		}
		else if (d<10){
			System.out.println("Point ("+x+","+y+") is in the circle");
		}
		else {
			System.out.println("Point ("+x+","+y+") is at the circle");
		}
	}

}
