import java.util.*;
public class Duplicate {
	public static int [] eliminateDuplicates(int[]list){
		List<Integer> l=new ArrayList<Integer>();
		int n=list[0];
		l.add(n);
		for(int i=1;i<list.length;i++){
			for(int j=0;j<i;j++){
				if(list[i]==list[j]) break;
				if(j==i-1) l.add(list[i]);
			}
		}
		int m =l.size();
		int []a = new int[m];
		for(int k=0;k<m;k++){
			a[k]=l.get(k);
		}
		return a;
	}

}
