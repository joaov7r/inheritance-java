package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Person> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		System.out.println("");
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or Company (i/c)? ");
			char ans = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Annual Income: ");
			double annualIncome = sc.nextDouble();
			if(ans == 'i') {
				System.out.print("Health expeditures: ");
				double healthExpeditures = sc.nextDouble();
				list.add(new Individual(name, annualIncome, healthExpeditures));
			}
			else {
				System.out.print("Number of employees: ");
				int employees = sc.nextInt();
				list.add(new Company(name, annualIncome, employees));
				}
			System.out.println("");
		}
		System.out.println("");
		double sum = 0.0;
		System.out.println("TAXES PAID: ");
		for (Person person : list) {
			double tax = person.tax();
			System.out.println(person.getName() + ": $" + String.format("%.2f", person.tax()));
			sum += tax;
		}
		
		System.out.println("");
		System.out.print("TOTAL TAXES: " + String.format("%.2f", sum));
		
		sc.close();
	}

}
