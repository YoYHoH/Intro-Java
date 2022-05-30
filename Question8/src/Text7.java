
public class Text7 {
	public static void main(String[] args){
		int[]a=Spiral.spiralPath();
		System.out.println("The spiral path is:");
		System.out.print("["+a[0]);
		for(int i=1;i<a.length;i++) System.out.print(", "+a[i]);
		System.out.println("]");
	}

}
