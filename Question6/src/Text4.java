import java.util.Scanner;
public class Text4 {
	private double ws=0;

	public double getWs() {
		return ws;
	}

	public void setWs(int ws) {
		if(ws>=1&&ws<=17) this.ws = ws;
		else System.out.println("The wind speed is wrong");
	}
	public Text4(int ws){
		this.ws=ws;
	}
	public int b(){
		return (int)Math.pow(ws/0.835, 2.0/3);
	}
	public static void main(String[] args){
		System.out.print("Enter wind speed: ");
		Scanner sc=new Scanner(System.in);
		Text4 w=new Text4(sc.nextInt());
		String s="";
		if(w.getWs()<2)  s="calm";
		else if(w.getWs()>70) s="windstorm";
		else s="normal";
		System.out.println("the wind with speed "+w.getWs()+" is \""+s+"\", its scale is "+w.b());
		sc.close();
	}

}
