import java.util.*;
public class Polygon {
	public enum Color{
		Yellow,Red,White,Black,Green;
		private String color;

		public String getColor() {
			return color;
		}
	}
	private Color color;
	private boolean filled;
	private String date;
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	Scanner sc = new Scanner(System.in);
	public Polygon(){
		int r=(int)(Math.random()*6);
		switch(r){
		case 0: filled=false;break;
		case 1: color=Color.Yellow;filled=true;break;
		case 2: color=Color.Red;filled=true;break;
		case 3: color=Color.White;filled=true;break;
		case 4: color=Color.Black;filled=true;break;
		case 5: color=Color.Green;filled=true;break;
		}
	}
	public double getArea(){
		return 0;
	}
	GregorianCalendar gc=new GregorianCalendar();
	public int y=gc.get(GregorianCalendar.YEAR);
	public int m=gc.get(GregorianCalendar.MONTH)+1;
	public int d=gc.get(GregorianCalendar.DAY_OF_MONTH);
	public String SD(){
		return d+","+m+","+y;
	}
	public String s=SD();
	@Override
	public String toString() {
		setDate(s);
		return "The "+getColor()+" color polygon created in "+getDate();
	}
	
	
	

}
