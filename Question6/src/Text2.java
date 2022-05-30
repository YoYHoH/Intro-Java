import java.util.Scanner;
public class Text2 {
	public static final double a=2.98,
			                   b=2.50,
			                   c=9.98,
			                   d=4.49,
			                   e=6.87;
	public static void main(String[] args){
		System.out.print("product number: ");
		Scanner sc=new Scanner(System.in);
		int n;
		int n1;
		double m = 0;
		double p = 0;
		while(true){
			n1=sc.nextInt();
			if(n1!=-1){
			switch(n1){
			case 1:p=a;break;
			case 2:p=b;break;
			case 3:p=c;break;
			case 4:p=d;break;
			case 5:p=e;break;
			}
			n=sc.nextInt();
			m=m+n*p;
		  }
			else break;
	    }
		System.out.printf("total price: %.2f",m);
		sc.close();
	}

}
