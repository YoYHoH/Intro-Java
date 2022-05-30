import java.util.Scanner;
public class Q1 {
	public static void main(String[]args){
		System.out.print("Enter an integer : ");
		Scanner input=new Scanner (System.in);
		int n=input.nextInt();
		System.out.print("The smallest factors :");
		if(n!=1){
		do{
		for(int j=2;j<=n;j++){
			if(n==(n/j*j)){
				System.out.printf("%2d", j);
				n=n/j;
				if(n!=1){
					System.out.print(", ");
				}
				else{
					System.out.print(". ");
				}
				break;
			}
		}
		input.close();
	}while(n!=1);
	}
		else{
			System.out.printf("%4d", 1);
		}
	}
}
