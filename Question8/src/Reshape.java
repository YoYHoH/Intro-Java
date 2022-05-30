import java.util.Scanner;

public class Reshape {
	public static int[][] A(){
		int [][]a = new int [3][4];
		System.out.print("Enter a 3*4 matrix: ");
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("The original matrix is:");
		for(int i1=0;i1<a.length;i1++){
			for(int j1=0;j1<a[0].length;j1++){
				System.out.printf("%4d",a[i1][j1]);
			}
			System.out.println();
		}
		System.out.println("Please enter thr number of row and column of the new matrix.");
		System.out.print("Row: ");
		int r=sc.nextInt();
		System.out.print("Column: ");
		int c=sc.nextInt();
		while(r*c != 12){
			System.out.println("Please enter the number of row and column of the new matrix.");
			System.out.print("Row: ");
			r=sc.nextInt();
			System.out.print("Column: ");
			c=sc.nextInt();
		}
		System.out.println("The new matrix is:");
		int[] b=new int [12];
		for(int i2=0;i2<a.length;i2++){
			for(int i3=0;i3<a[0].length;i3++){
				int b1=i2*4+i3;
				b[b1]=a[i2][i3];
			}
		}
		sc.close();
		int [][]m=new int [r][c];
		for(int j2=0;j2<r;j2++){
			for(int j3=0;j3<c;j3++){
				int m1=j2*c+j3;
				m[j2][j3]=b[m1];
			}
		}
		return m;
	}

}
