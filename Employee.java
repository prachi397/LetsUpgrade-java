package com.Employee;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee();
		e1.showDetails();
		e1.annualSalary();
		e1.taxAmount();
		Employee e2 = new Employee();
		e2.showDetails();
		e2.annualSalary();
		e2.taxAmount();
	    Employee e3 = new Employee();
	    e3.showDetails();
	    e3.annualSalary();
	    e3.taxAmount();
		Employee e4 = new Employee();
		e4.showDetails();
		e4.annualSalary();
		e4.taxAmount();
		

	}

}
public class Employee {
	int salary;
	int annual_salary;
	int tax_amount;
	int total_tax;
	Scanner sc = new Scanner(System.in);
	public void showDetails() {
		System.out.println("Enter the employee name ");
		String name = sc.nextLine();
		System.out.println("Enter date of birth ");
		int dateofBirth = sc.nextInt();
		System.out.println("Enter month of birth ");
		int monthofBirth = sc.nextInt();
		System.out.println("Enter year of birth ");
		int birthYear = sc.nextInt();
		System.out.println(name+" Your Date of birth is "+dateofBirth+"-" +monthofBirth+"-" +birthYear);
		
	}
	public void annualSalary() {
		System.out.println("Enter the monthly salary ");
		salary = sc.nextInt();
		annual_salary = salary*12;
		System.out.println("annual salary of employee is "+annual_salary);

		
	}
	public void taxAmount() {
		if(salary==500000) {
			total_tax= (500000*20)/100;
			System.out.println("Your salary is "+salary+ " total tax is "+total_tax);
		}
		else if(salary==400000) {
			total_tax= (400000*15)/100;
			System.out.println("Your salary is "+salary+  " total tax is "+total_tax);
			
		}
		else if(salary == 300000) {
			total_tax= (300000*10)/100;
			System.out.println("Your salary is "+salary+" total tax is "+total_tax);
		}
		else if(salary == 200000) {
			total_tax= (200000*5)/100;
			System.out.println("Your salary is "+salary+" total tax is "+total_tax);
		}
		
	}

}
