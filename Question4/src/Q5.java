import java.util.Scanner;
public class Q5 {
	public static int y(int year){
		int n1=0;
		if(year==(year/100)*100&&year==(year/400)*400){
			n1=1;
		}
		else if(year==(year/4)*4){
			n1=1;
		}
		return n1;
	}
	public static void main(String[]args){
		System.out.print("Enter year: ");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		System.out.print("Enter first day of the year: ");
		int day=input.nextInt();
		System.out.println();
		System.out.println("            January  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		int n=0;
		do{
			System.out.printf(" ");
			n++;
		}while (n<=6*day);
		System.out.printf("1    ");
		int i=day+1;
		int m=2;
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println();
		System.out.println("            February  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		int r=28+Q5.y(year);
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=r);
		m=2;
		System.out.println();
		System.out.println("            March  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println("            April  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=30);
		m=2;
		System.out.println();
		System.out.println("            May  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println("            June  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=30);
		m=2;
		System.out.println();
		System.out.println("            July  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println("            August  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println("            September  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=30);
		m=2;
		System.out.println();
		System.out.println("            Octomber  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		m=2;
		System.out.println();
		System.out.println("            November  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=30);
		m=2;
		System.out.println();
		System.out.println("            December  "+year);
		System.out.println("----------------------------------------");
		System.out.println("Sun   Mon   Tue   Wed   Thu   Fri   Sat ");
		n=0;
		while (n<i){
			System.out.printf("      ");
			n++;
		}
		System.out.print(" 1    ");
		if(i<6){
			i++;
		}
		else{
			i=0;
			System.out.printf("\n");
		}
		do{
			if(i<6){
				System.out.printf("%2s",m);
				System.out.print("    ");
			}
			if(i==6){
				System.out.printf("%2s",m);
				System.out.printf("\n");
				i=-1;
			}
			i++;
			m++;
		}while(m<=31);
		input.close();
	}

}