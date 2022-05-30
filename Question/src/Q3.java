import java.util.Scanner;

public class Q3 {
	public static void main(String[]args){
		System.out.println("Enter x1 and y1 :");
		System.out.println("Enter x2 and y2 :");
		Scanner input=new Scanner(System.in);
		float x1=input.nextFloat();
	    float y1=input.nextFloat();
	    float x2=input.nextFloat();
	    float y2=input.nextFloat();
	    System.out.println("The distance of the two point is  "+Math.pow((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1),0.5));
	    input.close();
	    
	}

}
