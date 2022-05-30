import java.util.*;
public class Text4 {
	public static void main(String[] args){
		System.out.print("Enter numbers bewteen 1 and 54:");
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int r=Random.getRandom(a);
		System.out.print("Random number:"+r);
		sc.close();
	}

}
