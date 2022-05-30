import java.util.Scanner;
public class Q1 {
	public static void main(String[]args){
		System.out.println("Enter a, b, c :");
		Scanner input=new Scanner(System.in);
		double a=input.nextDouble(),b=input.nextDouble(),c=input.nextDouble();
		input.close();
		double di=b*b-4*a*c;
		if(di>0){
		  double r1=(-b+Math.sqrt(di))/(2*a);
		  double r2=(-b-Math.sqrt(di))/(2*a);
		  System.out.println("The roots are "+r1+" and "+r2);
		}
		else if(di==0){
		   double r=(-b+Math.sqrt(di))/(2*a);
		   System.out.println("The root is "+r);
		}
		else {
			System.out.println("The equation has no real roots");
		}
	}

}
