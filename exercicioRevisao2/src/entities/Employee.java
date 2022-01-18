package entities;

public class Employee {
	public String name;
	public double gross_Salary;
	public double tax;
	
	public double netSalary() {
		return gross_Salary - tax;
	}
	public void increaseSalary(double porcentage) {
		porcentage = porcentage / 100;
	}
	public String toString() {
		return "Employee: " + name + " $" + gross_Salary;
		
	}

}
