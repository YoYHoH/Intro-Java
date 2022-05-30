
public abstract class AbstractEmployee implements Iemployee{
	private double basePay;
	private String employeeName;
	private double hourlyRate;
	private double numberOfHoursWorked;
	public AbstractEmployee(double basePay,String employeeName,double hourlyRate,double numberOfHoursWorked){
		this.basePay=basePay;
		this.employeeName=employeeName;
		this.hourlyRate=hourlyRate;
		this.numberOfHoursWorked=numberOfHoursWorked;
	}
	public double getBasePay() {
		return basePay;
	}
	public void setBasePay(double basePay) {
		this.basePay = basePay;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getNumberOfHoursWorked() {
		return numberOfHoursWorked;
	}
	public void setNumberOfHoursWorked(double numberOfHoursWorked) {
		this.numberOfHoursWorked = numberOfHoursWorked;
	}
	@Override
	public String toString() {
		return  "\n"+
	            "Employee Name: "+getEmployeeName()+"\n"+
				"Base Pay: $"+getBasePay()+"\n"+
				"Number of hours worked: $"+getNumberOfHoursWorked()+"hrs"+"\n"+
				"Payment Rate per hour: $"+getHourlyRate()+"/hr";
	}
	

}
