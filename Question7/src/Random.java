import java.util.Arrays;

public class Random {
	public static int getRandom(int...number){
		int r=0;
		while(true){
			r=(int)(Math.random()*54)+1;
			if(Arrays.asList(number).contains(r)) continue;
			return r;
		}
	}

}
