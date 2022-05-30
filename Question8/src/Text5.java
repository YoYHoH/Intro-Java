
public class Text5 {
	public static void main(String[] args){
		int []a=Minimum.minPath();
		System.out.println("The minimum path:");
		System.out.print("["+a[0]);
		for(int i=1;i<a.length;i++) System.out.print(", "+a[i]);
		System.out.println("]");
	}

}
