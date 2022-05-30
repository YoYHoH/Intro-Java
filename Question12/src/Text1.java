import java.util.*;
public class Text1 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Please input the name: ");
		String employeeName=sc.nextLine();
		System.out.print("Please input the sale that has been finished: ");
		double saleDone=sc.nextDouble();
		System.out.print("Please input the number of hours worked: ");
		double numberOfHoursWorked=sc.nextDouble();
		System.out.print("Please input the hourly rate: ");
		double hourlyRate=sc.nextDouble();
		System.out.print("Please input the base pay: ");
		double basePay=sc.nextDouble();
		Manager m = new Manager(basePay,employeeName,hourlyRate,numberOfHoursWorked,saleDone);
		System.out.println(m.toString());
		sc.close();
	}

}
