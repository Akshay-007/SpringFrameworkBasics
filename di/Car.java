package di;

public class Car implements Vehicle {
private double costPerKm;
private String regNo;
	public double getCostPerKm() {
		
		return costPerKm;
	}
	public void setCostPerKm(double costPerKm)
	{
		this.costPerKm=costPerKm; 
	}
	public void setRegNo(String regNo)
	{
		this.regNo=regNo;
	}
	public String getRegNo() {
		return regNo;
	}

}
