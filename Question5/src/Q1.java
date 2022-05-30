import java.util.Scanner;
public class Q1 {
	public static void main(String[] args){
		System.out.print("Enter a, b, c:");
		Scanner input=new Scanner(System.in);
		QuadraticEquation Q=new QuadraticEquation();
		Q.setA(input.nextDouble());
		Q.setB(input.nextDouble());
		Q.setC(input.nextDouble());
		if(Q.discriminant()<0){
			System.out.println("The equation has no real roots");
		}
		if(Q.discriminant()==0&&Q.getRoot1()==Q.getRoot2()){
			System.out.println("The equation has one root "+Q.getRoot1());
		}
		if(Q.discriminant()>0){
			System.out.println("The equation has two roots "+Q.getRoot1()+" and "+Q.getRoot2());
		}
		input.close();
	}

}
