
import java.util.*;
public class Saler extends Human{
	private String company;
	private int salary;
	private String dateOfHire;
	public Saler(){
		System.out.println("Please input the company");
		this.company=sc.next();
		System.out.println("Enter salary:");
		this.salary=sc.nextInt();
		setOccupation("Saler");
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getDateOfHire() {
		return dateOfHire;
	}
	public void setDateOfHire(String dateOfHire) {
		this.dateOfHire = dateOfHire;
	}
	GregorianCalendar gc=new GregorianCalendar();
	public int y=gc.get(GregorianCalendar.YEAR);
	public int m=gc.get(GregorianCalendar.MONTH)+1;
	public int d=gc.get(GregorianCalendar.DAY_OF_MONTH);
	public String SD(){
		return d+","+m+","+y;
	}
	public String s=SD();
	@Override
	public String toString() {
		setDateOfHire(s);
		return  super.toString() +"work as "+super.getOccupation()+" in "
				+getCompany()+"\n"+"salary as "+getSalary()+" hired on "
				+getDateOfHire();
	}
	

}
