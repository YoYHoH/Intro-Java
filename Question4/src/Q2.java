import java.util.Scanner;
public class Q2 {
	public static void main(String[]args){
		System.out.print("Enter 5 numbers :");
		Scanner input=new Scanner (System.in);
		int n1=input.nextInt();
		int n2=input.nextInt();
		int n3=input.nextInt();
		int n4=input.nextInt();
		int n5=input.nextInt();
		double a=(n1+n2+n3+n4+n5)/5.0;
		double d=Math.sqrt((n1*n1+n2*n2+n3*n3+n4*n4+n5*n5-(n1+n2+n3+n4+n5)*(n1+n2+n3+n4+n5)/5.0)/4.0);
		System.out.println("The mean is "+a);
		System.out.printf("The standard deviation is ");
		System.out.printf("%.5f",d);
		input.close();
	}

}
