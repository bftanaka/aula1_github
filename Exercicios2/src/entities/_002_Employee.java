package entities;

public class _002_Employee {

	public String nome;
	public double grossSalary;
	public double tax;
	public double increaseSalary;
	
	public double salarioLiquido;	
	public double updateSalary;
	
	
	 public double salarioLiquido () {
		salarioLiquido = grossSalary - tax;		
		return salarioLiquido;
	}	
	
	public double updateSalary() {
		updateSalary = ((grossSalary * (increaseSalary/100)) + grossSalary) - tax;		
		return updateSalary;		
	}
	
	
}
