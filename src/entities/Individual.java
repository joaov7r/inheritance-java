package entities;

public class Individual extends Person {
	
	private Double healthExpenditures;
	
	public Individual() {
		
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}


	@Override
	public double tax() {
		if(getAnnualIncome() < 20000.00) {
		return (annualIncome * 0.15) - (healthExpenditures / 2);
	}
		else {
			return (annualIncome * 0.25) - (healthExpenditures / 2);
		}
	}	
}
