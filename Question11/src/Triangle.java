

public class Triangle extends Polygon{
	private int side1,side2,side3;
	public Triangle(){
//		super();
//		int r=(int)Math.random()*6;
//		switch(r){
//		case 0: p.setFilled(false);break;
//		case 1: setColor(Color.Yellow);p.setFilled(true);break;
//		case 2: setColor(Color.Red);p.setFilled(true);break;
//		case 3: setColor(Color.White);p.setFilled(true);break;
//		case 4: setColor(Color.Black);p.setFilled(true);break;
//		case 5: setColor(Color.Green);p.setFilled(true);break;
//		}
		System.out.println("Enter the three sides for a triangle:");
		int s1=sc.nextInt();
		int s2=sc.nextInt();
		int s3=sc.nextInt();
		this.side1=(s1>0)? s1:1;
		this.side2=(s2>0)? s2:1;
		this.side3=(s3>0)? s3:1;
		if(side1+side2<=side3||side2+side3<=side1||side1+side3<=side2){
			this.side1=1;
			this.side2=1;
			this.side3=1;
		}
	}
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	public int getSide3() {
		return side3;
	}
	public void setSide3(int side3) {
		this.side3 = side3;
	}
	public double getArea(){
		double p=(getSide1()+getSide2()+getSide3())/2.0;
		double a = Math.sqrt(p*(p-getSide1())*(p-getSide2()*(p-getSide3())));
		return a;
	}
	@Override
	public String toString() {
		return String.format("%s%s%s%.1f","Tiangle: ",super.toString(),
				"the area is ",getArea());
	}
	

}
