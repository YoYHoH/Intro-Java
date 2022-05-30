import java.util.*;
public class Text7 {
	public static void main(String args[]){
		System.out.print("Enter ten integers:");
		Scanner sc = new Scanner(System.in);
		int []a=new int [10];
		for(int m=0;m<a.length;m++) a[m]=sc.nextInt();
		List<Integer> l=new ArrayList<Integer>();
		int n=a[0];
		l.add(n);
		for(int i=1;i<a.length;i++){
			for(int j=0;j<i;j++){
				if(a[i]==a[j]) break;
				if(j==i-1) l.add(a[i]);
			}
		}
		int m =l.size();
		int []b = new int[m];
		for(int k=0;k<m;k++) b[k]=l.get(k);
		Arrays.sort(b);
		for(int o=0;o<b.length;o++){
			for(int p=o+1;p<b.length;p++){
				System.out.print("["+b[o]+","+b[p]+"]"+" ");
			}
		}
		sc.close();
	}
}
