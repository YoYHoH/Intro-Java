import java.util.Scanner;
public class Text1 {
	public static int x1=12,
			   x2=24,
			   x3=8,
			   x4=22,
			   x5=15,
			   x6=4,
			   x7=8,
			   x8=6;
	private int x=0;
	public int getX() {
		return x;
	}

	public void setX(int x) {
		if(x>=1&&x<=40) this.x = x;
		else System.out.println("Input is wrong");
	}
	public Text1(){}
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter x: ");
		Text1 t=new Text1();
		t.setX(sc.nextInt());
		int i;int n;
		for(i=1;;i++){
			x1=x1/2;
			x2=x2/2;			
			x3=x3/2;			
			x4=x4/2;			
			x5=x5/2;			
			x6=x6/2;			
			x7=x7/2;			
			x8=x8/2;
			t.setX(t.getX()/2);
			n=x1;
			x1=x1+t.getX();
			t.setX(t.getX()+x8);
			x8=x8+x7;
			x7=x7+x6;
			x6=x6+x5;
			x5=x5+x4;
			x4=x4+x3;
			x3=x3+x2;
			x2=x2+n;
			if(x1==x2&&x2==x3&&x3==x4&&x4==x5&&x5==x6&&x6==x7&&x7==x8&&x8==t.getX()) break;
		}
		System.out.println("After looping "+i+" times, each kid get "+t.getX()+"  chocolates.");
		sc.close();
	}

}
