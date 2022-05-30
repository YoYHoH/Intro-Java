import java.util.*;
public class Smooth {
	public static int[][] get(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns :");
		int r=sc.nextInt();
		int c=sc.nextInt();
		System.out.print("Enter a "+r+"*"+c+" integer matrix with value in [0, 255]: ");
		int [][]a= new int[r][c];
		for(int i1=0;i1<r;i1++){
			for(int j1=0;j1<c;j1++) a[i1][j1]=sc.nextInt();
		}
		for(int i2=0;i2<r;i2++){
			for(int j2=0;j2<c;j2++) System.out.printf("%4d",a[i2][j2]);
			System.out.println();
		}
		sc.close();
		return a;
	}
	public static int[][] smoothImage(){
		int sum=0;
		int n=0;
		int[][]A=Smooth.get();
		int[][]b=new int[A.length][A[0].length];
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[0].length;j++){
				for(int i1=-1;i1<2;i1++){
					for(int j1=-1;j1<2;j1++){
//						if(i+i1<0||j+j1<0||i+i1>b.length||j+j1>b[0].length) continue;
//						sum=sum+b[i+i1][j+j1];
//						n++;
						if(i+i1>=0 && j+j1>=0 && i+i1<b.length && j+j1<b[0].length){
						sum=sum+A[i+i1][j+j1];
						n++;	
						}	
					}
				}
				b[i][j]=sum/n;
				sum=0;
				n=0;
			}
		}
		return b;
	}

}
