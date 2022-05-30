
public class Q4 {
	public static void main(String[]args){
		int n1=(int)(Math.random()*90+10),n2=(int)(Math.random()*90+10),n3=(int)(Math.random()*90+10);
		System.out.println("The 3 random integers generately by Math.random(): "+n1+" "+n2+" "+n3);
		int max=0,min=0;
		if (n1<n2){
			max=n2;
			min=n1;
		}
		else{
			max=n1;
			min=n2;
		}
		if(n3>max){
			max=n3;
		}
		if(n3<min){
			min=n3;
		}
		System.out.println("The max value : "+max);
		System.out.println("The min value : "+min);
	}

}
