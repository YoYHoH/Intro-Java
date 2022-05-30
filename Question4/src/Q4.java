import java.util.Scanner;
public class Q4 {
	public static void main(String[]args){
		System.out.print("Enter three sides for a triangle: ");
		Scanner input=new Scanner(System.in);
		double side1=input.nextDouble();
		double side2=input.nextDouble();
		double side3=input.nextDouble();
		if(MyTriangle.isValid(side1, side2, side3)){
			System.out.printf("The area of the triangle is ");
			System.out.printf("%.3f",MyTriangle.area(side1, side2, side3));
		}
		else{
			System.out.println("Input is in valid");
		}
		input.close();
	}

}
