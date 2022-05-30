
public class MyTriangle {
	public static boolean isValid(double side1,double side2,double side3){
		if(side1+side2>side3&&side1+side3>side2&&side3+side2>side1){
			return true;
		}
		else{
			return false;
		}
	}
	public static double area(double side1,double side2,double side3){
		double p=(side1+side2+side3)/2;
		return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
	}

}
