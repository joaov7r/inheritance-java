package entities;

public class Company extends Person {
	
	private Integer employees;
	
	public Company() {
		
	}
	
	public Company(String name, Double annualIncome, Integer employees) {
		super(name, annualIncome);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}

	@Override
	public double tax() {
		if(getEmployees() > 10) {
			return annualIncome * 0.14;
		}
		else {
			return annualIncome * 0.16;
		}
	}

	
}
