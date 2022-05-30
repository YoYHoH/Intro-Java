
public class Text3 {
	public static void main(String[] args){
		int [][]a=Reshape.A();
		for(int i1=0;i1<a.length;i1++){
			for(int j1=0;j1<a[0].length;j1++){
				System.out.printf("%4d",a[i1][j1]);
			}
			System.out.println();
		}
	}

}
