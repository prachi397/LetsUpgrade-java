package com.ques4;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Employee[] Emp = new Employee[3];
		int i;
		  for(i=0;i<3;i++)
              Emp[i] =  new Employee();   // Allocating memory to each object

          for(i=0;i<3;i++)
          {
              System.out.print("\nEnter details of "+ (i+1) +" Employee\n");
              Emp[i].getDetails();
          }

          System.out.print("\nDetails of Employees\n");
          for(i=0;i<3;i++)
              Emp[i].showDetails();

      
	}

}

public class Employee {
  Scanner sc = new Scanner(System.in);
  int id;
  String name;
  int age;
  double salary;
  public void getDetails() {
	  System.out.println("enter employee id: ");
	  id = sc.nextInt();
	  System.out.println("enter employee name: ");
	  name = sc.next();
	  System.out.println("enter employee age: ");
	  age = sc.nextInt();
	  System.out.println("enter employee salary: ");
	  salary = sc.nextDouble();
  }
  public void showDetails() {
	 System.out.println("employee id is: "+id);
	 System.out.println("employee name is: "+name);
	 System.out.println("employee age is: "+age);
	 System.out.println("employee salary is: "+salary);
  }
}
