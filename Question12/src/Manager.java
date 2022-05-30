
public class Manager extends AbstractEmployee{
	private double bonusRate;
	private double salesDone;
	public Manager(double basePay,String employeeName,double hourlyRate,double numberOfHoursWorked,double saleDone){
		super(basePay,employeeName,hourlyRate,numberOfHoursWorked);
		if(saleDone>10000) this.bonusRate=0.15;
		else this.bonusRate=0.1;
	}
	@Override
	public double calculatePay() {
		// TODO Auto-generated method stub
		return super.getNumberOfHoursWorked()*super.getHourlyRate()
				+super.getBasePay()*(1+bonusRate);
	}
	@Override
	public boolean checkPromotionEligibility() {
		// TODO Auto-generated method stub
		return (calculatePay()>500000)? true:false;
	}
	public double getBonusRate() {
		return bonusRate;
	}
	public void setBonusRate(double bonusRate) {
		this.bonusRate = bonusRate;
	}
	public double getSalesDone() {
		return salesDone;
	}
	public void setSalesDone(double salesDone) {
		this.salesDone = salesDone;
	}
	@Override
	public String toString() {
		return  super.toString()+"\n"+
				"pay:"+calculatePay()+"\n"+
				"Promotion: "+checkPromotionEligibility();
	}
	

}
