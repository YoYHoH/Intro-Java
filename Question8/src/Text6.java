
public class Text6 {
	public static void main(String[] args){
		int[][]a=Rotate.Rotation();
		System.out.println("The matrix after clockwise retate is:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.printf("%4d",a[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
