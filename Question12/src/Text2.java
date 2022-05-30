import java.util.*;
public abstract class Text2 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Lab12Queue<String> l = new Lab12Queue<>();
		System.out.println("Please input four words respectively");
		l.offer(sc.nextLine());
		l.offer(sc.nextLine());
		l.offer(sc.nextLine());
		l.offer(sc.nextLine());
	    System.out.print(l.remove()+" ");
	    System.out.print(l.remove()+" ");
	    System.out.print(l.remove()+" ");
	    System.out.print(l.remove()+" ");
	}

}
