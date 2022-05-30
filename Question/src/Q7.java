import java.util.Scanner;
public class Q7 {
	public static void main (String[]args){
		System.out.println("Enter a number between 0 and 1000 : ");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int s=n%10+(n/10)%10+(n/100)%10;
		System.out.println("The sum of the digits is " + s);
		input.close();
	}

}
