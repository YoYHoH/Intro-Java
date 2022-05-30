import java.util.*;
public class Rotate {
	public static int[][] Rotation(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows and columns :");
		int n=sc.nextInt();
		System.out.print("Enter a "+n+"*"+n+" matrix : ");
		int [][]a= new int[n][n];
		for(int i1=0;i1<n;i1++){
			for(int j1=0;j1<n;j1++) a[i1][j1]=sc.nextInt();
		}
		System.out.println("The original matrix is:");
		for(int i2=0;i2<n;i2++){
			for(int j2=0;j2<n;j2++) System.out.printf("%4d",a[i2][j2]);
			System.out.println();
		}
		int [][]b= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				b[i][j]=a[n-j-1][i];
			}
		}
		sc.close();
		return b;
	}

}
