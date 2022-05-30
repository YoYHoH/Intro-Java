
public class Q5 {
	public static void main(String[]args){
		for(int i=0;i<29;i++){
			for(int s1=0;s1<29-i;s1++){
				System.out.printf("   ");
			}
			for(int b1=28;b1>0;b1--){
				if(b1<=i){
					System.out.printf("%3d", b1);
				}
			}
			for(int j=0;j<=i;j++){
				System.out.printf("%3d",j);
			}
			System.out.printf("\n");
		}
		for(int k=27;k>=0;k--){
			for(int s2=28;s2>0;s2--){
				if(s2>=k){
					System.out.printf("   ");
				}
			}
			for(int b2=28;b2>0;b2--){
				if(b2<=k){
					System.out.printf("%3d",b2);
				}
			}
			for(int l=0;l<=k;l++){
				if(k==0){
				System.out.printf("   ");
				}
				System.out.printf("%3d",l);
			}
			System.out.printf("\n");
		}
	}

}
