
public class QuadraticEquation{
	private double a;
	private double b;
	private double c;
	private double discriminant;
	public double r1;
	public double r2;
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	public void setB(double b) {
		this.b = b;
	}
	public double getC() {
		return c;
	}
	public void setC(double c) {
		this.c = c;
	}
	public QuadraticEquation(double a, double b, double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public double discriminant(){
		return discriminant=b*b-4*a*c;
	}
	public void setDiscriminant(double discriminant) {
		this.discriminant = discriminant;
	}
	public double getRoot1() {
		if(discriminant<0) return r1=0;
		else return r1=(-b+Math.sqrt(discriminant))/(2*a);
	}
	public double getRoot2() {
		if(discriminant<0) return r2=0;
		else return r2=(-b-Math.sqrt(discriminant))/(2*a);
		}
	public QuadraticEquation(){}

}