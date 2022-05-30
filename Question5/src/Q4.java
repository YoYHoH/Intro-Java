
public class Q4 {
	public static void main(String[]args){
		Circle2D c1=new Circle2D(2,2,5.5);
		double a=c1.getArea(c1.getRadius());
		double p=c1.getPerimeter(c1.getRadius());
		System.out.printf("Circle1 area: %.3f\n",a);
		System.out.printf("Circle1 perimeter: %.3f\n",p);
		System.out.println("Does circle1 contain the point (3, 3)? "
		                    +c1.contains(3, 3));
		System.out.println("Does circle1 contain the circle centered at (4, 5) and radius 10.5? "
		                    +c1.contains(4, 5, 10.5));
		System.out.println("Does circle1 overlap the circle centered at (3, 5) and radius 2.3? "
				            +c1.overlaps(3, 5, 2.3));
		
	}

}
