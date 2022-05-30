import java.util.*;
public class Human {
	private String firstName;
	private String lastName;
	private int height;
	private String birthday;
	private String occupation;
	Scanner sc=new Scanner(System.in);
	public Human(){
		System.out.println("Please input the first name:");
		this.firstName=sc.next();
		System.out.println("Please input the last name:");
		this.lastName=sc.next();
		System.out.println("Please input height:");
		this.height =sc.nextInt();
		System.out.println("Enter date of birth in DD/MM/Year:");
		this.birthday=sc.next();
		this.occupation="no-work-yet";
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return  getLastName() + " "+getFirstName() + " is " + getHeight() + " born on " + getBirthday()+" ";
	}
	

}
