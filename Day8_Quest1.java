package com.Inheritance;
import java.util.Scanner;
public class Main {
   public static void main(String[] args) {

Child c1 = new Child();
c1.getDetails();
c1.displayDetails();
c1.employee();
    }

}
public class Parent {
	Scanner sc = new Scanner(System.in);
	String name;
	int age;
	double salary;
	String destination;
	public void getDetails() {
		System.out.println("Enter the employee's name: ");
		name = sc.nextLine();
		System.out.println("Enter the employee's age: ");
		age = sc.nextInt();
		System.out.println("Enter the employee's salary: ");
		salary = sc.nextDouble();
		System.out.println("Enter the employee's destination: ");
		destination = sc.next();
	}
	public void displayDetails() {
		System.out.println("employee's name is: "+name);
		System.out.println("employee's age is: "+age);
		System.out.println("employee's salary is: "+salary);
		System.out.println("employee's destination is: "+destination);
	}

}

public class Child extends Parent {
	public void employee() {
		System.out.println("I am a employee");
	}

}