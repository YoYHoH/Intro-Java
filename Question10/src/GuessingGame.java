import java.util.*;
public class GuessingGame {
	private int magicNum;
	private enum Status{CONTINUE,WON,LOST,STOP}
	public Status gameStatus;
	public static int time=30;
	public void timeControl(){
		Timer timer=new Timer();
		timer.schedule(new TimerTask(){
			public void run(){
				time--;
				if(time<0 & gameStatus.equals(Status.CONTINUE)){
					gameStatus=Status.STOP;
					System.out.println("-----------------Time is up-------------------------");
					          System.out.println("no winner"+", the number is "+magicNum);
					System.exit(0);
				}
			}
		},0,500);
	}
	GuessingGame(){
		this.magicNum=(int)(100*Math.random()+1);
	}
	public void guess(){
		Scanner sc = new Scanner(System.in);
		this.gameStatus=Status.CONTINUE;
		int left =1 ;
		int right = 100;
		GuessingGame.this.timeControl();
		while(true){
			System.out.println("----You turn: ( " +left+" to "+right+" )----");
			int a = sc.nextInt();
			int b=0;
			if(a>magicNum){
				right=a-1;
				System.out.println("Your input is too large");
				b=(int)((a-left)*Math.random()+left);
				if(b>magicNum) {System.out.println("*****The computer guess "+b+" ("+left+" to "+right+"), the number is too large****");right=b-1;}
				else if(b<magicNum){ System.out.println("*****The computer guess "+b+" ("+left+" to "+right+"), the number is too small****");left=b+1;}
				else{
					this.gameStatus=Status.LOST;
					break;
				}
			}
			else if(a<magicNum){
				left=a+1;
				System.out.println("You input is too small");
				b=(int)((right-a)*Math.random()+left);
				if(b>magicNum) {System.out.println("*****The computer guess "+b+" ("+left+" to "+right+"), the number is too large****");right=b-1;}
				else if(b<magicNum) {System.out.println("*****The computer guess "+b+" ("+left+" to "+right+"), the number is too small****");left=b+1;}
				else{
					this.gameStatus=Status.LOST;
					break;
				}
			}
			else {this.gameStatus=Status.WON; break;}
			if(gameStatus.equals(Status.STOP)) break;
			
		}
		switch(this.gameStatus){
		case LOST:System.out.println("-----------------Game is Finish---------------------");
		          System.out.println("you lose the game"+", the number is "+magicNum);
		          break;
		case WON:System.out.println("-----------------Game is Finish---------------------");
		         System.out.println("you win the game"+", the number is "+magicNum);
		         break;
//		case STOP:System.out.println("-----------------Time is up-------------------------");
//		          System.out.println("no winner"+", the number is "+magicNum);
//		          break;
		}
		sc.close();
	}

}
