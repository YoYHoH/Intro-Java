import java.util.Scanner;
public class Text1 {
	public static void main(String[] args){
		double [] myList = new double [4];
		System.out.print("Enter 4 values:   ");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<4;i++) myList[i]=sc.nextDouble();
		System.out.print("The shifted array:");
		double m=myList[0];
		myList[0]=myList[1];
		myList[1]=myList[2];
		myList[2]=myList[3];
		myList[3]=m;
		for(int j=0;j<4;j++) System.out.print(myList[j]+" ");
		sc.close();
	}

}
