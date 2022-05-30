

public class Square extends Polygon{
	private int length;
	private int height;
	public Square(){
//		Polygon p =new Polygon();
//		int r=(int)Math.random()*6;
//		switch(r){
//		case 0: p.setFilled(false);break;
//		case 1: setColor(Color.Yellow);p.setFilled(true);break;
//		case 2: setColor(Color.Red);p.setFilled(true);break;
//		case 3: setColor(Color.White);p.setFilled(true);break;
//		case 4: setColor(Color.Black);p.setFilled(true);break;
//		case 5: setColor(Color.Green);p.setFilled(true);break;
//		}
		System.out.println("Enter the length and height for a square:");
		int l=sc.nextInt();
		int h=sc.nextInt();
		this.length=(l>0)? l:1;
		this.height=(h>0)? h:1;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getArea(){
		double a = getLength()*getHeight();
		return a;
	}
	@Override
	public String toString() {
		return String.format("%s%s%s%.1f","Square: ",super.toString(),
				"the area is ",getArea());
	}
	public static void main(String[] args){
		System.out.println(new Square());
	}
	

}
