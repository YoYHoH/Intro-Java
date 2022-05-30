import java.util.*;
public class Text3 {
	public static void main(String[] args){
		System.out.print("Enter the integers between 1 and 100:");
		int []a = new int [100];
		Scanner sc=new Scanner(System.in);
		for(int i=0;;i++){
			int m=sc.nextInt();
			if(m==0) break;
			else a[i]=m;
		}
		Arrays.sort(a);
		int n=0;
		int b=a[0];
		String s="";
		for(int j=0;j<a.length;j++){
			if(a[j]==0) b=a[j+1];
			if(a[j]!=0){
			if(b!=a[j]){
				if(n==1) s=" time";else s=" times";
				System.out.println(b+" occurs "+n+s);
				b=a[j];
				n=1;
			}else n++;
			if(j==a.length-1) {
				if(n==1) s=" time";else s=" times";
				System.out.println(b+" occurs "+n+s);
			}
		}
		}
		sc.close();
	}

}
