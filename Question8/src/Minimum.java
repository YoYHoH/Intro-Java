import java.util.*;
public class Minimum {
	public static int[] minPath(){
		System.out.print("The height of triangle (the first dimension of the jagged array): ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Please input the triangle data into the jagged array");
		int [][]a = new int[n][n];
		for(int i=0;i<n;i++){
			System.out.print("The "+i+" row of the triangle: ");
			for(int j=0;j<=i;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The triangle:");
		for(int i1=0;i1<n;i1++){
			for(int j1=0;j1<=i1;j1++) System.out.printf("%3d",a[i1][j1]);
			System.out.println();
		}
		int [] b =new int [n];
		b[0]=a[0][0];
		int x=0;
		for(int i3=1;i3<n;i3++){
			if(a[i3][x]>=a[i3][x+1]){
				b[i3]=a[i3][x+1];
				x++;
			}
			else b[i3]=a[i3][x];
		}
		sc.close();
		return b;
	}

}
