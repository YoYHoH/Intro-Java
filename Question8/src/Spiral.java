import java.util.*;
public class Spiral {
	public static int[] spiralPath(){
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
		int[]b= new int[n*n];
		sc.close();
		if(n==3){
			b[0]=a[0][0];
			b[1]=a[0][1];
			b[2]=a[0][2];
			b[3]=a[1][2];
			b[4]=a[2][2];
			b[5]=a[2][1];
			b[6]=a[2][0];
			b[7]=a[1][0];
			b[8]=a[1][1];
		}
		if(n==4){
			b[0]=a[0][0];
			b[1]=a[0][1];
			b[2]=a[0][2];
			b[3]=a[0][3];
			b[4]=a[1][3];
			b[5]=a[2][3];
			b[6]=a[3][3];
			b[7]=a[3][2];
			b[8]=a[3][1];
			b[9]=a[3][0];
			b[10]=a[2][0];
			b[11]=a[1][0];
			b[12]=a[1][1];
			b[13]=a[1][2];
			b[14]=a[2][2];
			b[15]=a[2][1];
		}
		return b;
	}

}
