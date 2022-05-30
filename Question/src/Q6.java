import java.util.Scanner;
public class Q6 {
	public static void main (String[]args){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the radius and length of a cylinder : ");
		double r=input.nextDouble();
		double l=input.nextDouble();
		double a=Math.pow(r, 2) * Math.PI;
		double v=a*l;
		System.out.println("The area is "+a);
		System.out.println("The volume is "+v);
		input.close();
	}

}
