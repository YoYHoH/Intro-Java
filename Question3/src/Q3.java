import java.util.Scanner;
public class Q3 {
	public static void main(String[]args){
		System.out.println("Enter the string :");
		Scanner input=new Scanner(System.in);
		String str=input.nextLine();
		input.close();
		int n=str.length();
		int n1=0;
		for(int i=0;i<n;i++){
			if(Character.isDigit(str.charAt(i))){
				n1++;
			}
		}
		System.out.println("The number of digits in the string : "+n1);
	}

}
