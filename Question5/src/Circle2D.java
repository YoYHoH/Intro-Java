
public class Circle2D {
	private double x,y,radius;
	public double getX() {
		return x;
	}
	public double getY() {
		return y;
	}
	public double getRadius() {
		return radius;
	}
	public Circle2D(double x,double y,double radius){
		this.x=x;
		this.y=y;
		this.radius=radius;
	}
	public double getArea(double radius){
		double a;
		a=radius*radius*Math.PI;
		return a;
	}
	public double getPerimeter(double radius){
		double p;
		p=2*radius*Math.PI;
		return p;
	}
	public boolean contains(double x1,double y1){
		if((x1-x)*(x1-x) + (y1-y)*(y1-y) < radius*radius) return true;
		else return false;
	}
	public boolean contains(double x1,double y1,double radius1){
		if(Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)) > Math.abs(radius1-radius)) return true;
		else return false;
	}
	public boolean overlaps(double x1,double y1,double radius1){
		if(Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)) > Math.abs(radius1-radius)
		    &&Math.sqrt((x1-x)*(x1-x) + (y1-y)*(y1-y)) < radius1+radius)
			return true;
		else return false;
	}
	

}
