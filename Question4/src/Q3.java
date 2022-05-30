import java.util.Scanner;
public class Q3 {
	public static void main(String[]args){
		System.out.print("Enter numbers: ");
		Scanner input=new Scanner(System.in);
		int max=Integer.MIN_VALUE;
		int n=1;
		int t=1;
		while(true){
			int num=input.nextInt();
			if(num>=max){
				if(num==max&&t>1){
					n++;
				}
				if(num>max){
					n=1;
				}
				max=num;
			}
			t++;
			if(num==0){
				break;
			}
		}
		System.out.println("The largest number is "+max);
		System.out.println("The occurrence count of the largest number is "+n);
		input.close();
	}

}
