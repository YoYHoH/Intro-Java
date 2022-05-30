
public class Text4 {
	public static void main(String[] args){
		int [][]a=Smooth.smoothImage();
		System.out.println("The smooth image is:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[0].length;j++){
				System.out.printf("%4d",a[i][j]);
			}
			System.out.printf("\n");
		}
	}

}
