import java.util.*;
public class Text5 {
	public static void main(String[] args){
		System.out.print("Enter ten numners: ");
		int []a=new int [10];
		Scanner sc=new Scanner(System.in);
		for(int j=0;j<a.length;j++){
			a[j]=sc.nextInt();
		}
		System.out.print("The distinct numbers are: ");
		for(int i=0;i<Duplicate.eliminateDuplicates(a).length;i++){
				System.out.print(Duplicate.eliminateDuplicates(a)[i]+" ");
		}
		sc.close();
	}

}
