
public class CozaLozaWoza {
	public static void main(String[] args){
		for(int i=1;i<=110;i++){
			if(i==i/3*3) System.out.print("Coza");
			if(i==i/5*5) System.out.print("Loza");
			if(i==i/7*7) System.out.print("Woza");
			if(i!=i/3*3&&i!=i/5*5&&i!=i/7*7) System.out.print(i);
			System.out.print("  ");
			if(i==i/11*11) System.out.println();
		}
	}

}
