import java.util.*;
public class TextPolygon{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Please input how many polygons we prepare to create: ");
		int n = sc.nextInt();
		Polygon []a=new Polygon [n];
		System.out.print("Please input how many polygons we muat be created: ");
		int t=sc.nextInt();
		ArrayList<Polygon> b= new ArrayList<>();
		for(int i=0;i<t;i++){
			if(i==n) System.out.println("List has been created");
			System.out.print("Please input polygon type: 1 or 2: ");
			int tp=sc.nextInt();
			if(tp==1){
				if(i<n) a[i]=new Square();
				else b.add(new Square());
			}
			if(tp==2){
				if(i<n) a[i]= new Triangle();
				else b.add(new Triangle());
			}
			else{
				if(i<n) a[i]=new Polygon();
				else b.add(new Polygon());
			}
		}
		for(Polygon c:a){
			if(c.isFilled()) System.out.println(c.toString());
		}
		for(Polygon d:b){
			if(d.isFilled()) System.out.println(d.toString());
		}
		sc.close();
	}

}
