package com.avenger;
import java.util.Scanner;
public class Avenger {
	String name;
	int age;
	String power;
	String weapon;
	String planet;
	Scanner sc = new Scanner(System.in);
	public void getDetails() {
		System.out.println("Enter the name ");
		name = sc.nextLine();
		System.out.println("Enter the age ");
		age = sc.nextInt(); 
		System.out.println("Enter the power ");
		power = sc.nextLine();
		System.out.println("Enter the weapon ");
		weapon = sc.nextLine();
		System.out.println("Enter the planet ");
		planet = sc.nextLine();
		
	}
	public void displayDetails() {
		System.out.println("The name of avenger is "+name);
		System.out.println("The age of aveger is "+age);
		System.out.println("Power of avenger is "+power);
		System.out.println("Weapon of avenger is "+weapon);
		System.out.println("Planet of avenger is "+planet);
	}

}
