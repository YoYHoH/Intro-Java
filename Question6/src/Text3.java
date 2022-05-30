
public class Text3 {
	public static void main(String[] args){
		int n=0;
		for(int i=100;i<=999;i++){
			int a;     a=i/100;
			int b;     b=(i-a*100)/10;
			int c;     c=i-a*100-b*10;
			int sum;   sum=a*a*a+b*b*b+c*c*c;
			if(i==sum){
				n++;
				System.out.print(i+"   ");
			}
		}
		System.out.println();
		System.out.println("The total number of naricissus numbers is "+n);
	}

}
