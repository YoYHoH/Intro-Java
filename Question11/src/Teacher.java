
public class Teacher extends Human {
	private String university;
	private int salary;
	private String major;
	public Teacher(){
		System.out.println("Enter university:");
		this.university=sc.next();
		System.out.println("Enter major:");
		this.major=sc.next();
		System.out.println("Enter salary:");
		this.salary=sc.nextInt();
	}
	
	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString()+"work as "+super.getOccupation()+" in "
				+getUniversity()+"\n"+"major in "+getMajor()+" salary as "+getSalary();
	}
	

}
