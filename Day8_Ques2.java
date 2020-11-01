package com.ques2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		d.operation();
		Engineer e = new Engineer();
		e.coding();
		Pilot p = new Pilot();
		p.flyPlanes();
		
	}

}

public class Parent {
	Scanner sc = new Scanner(System.in);
	String name = sc.next();
	int age = sc.nextInt();
	public void getDetails() {
		System.out.println("Your name is: "+name);
		System.out.println("Your age is: "+age);
	}
	
  
}
public class Doctor extends Parent {
   public void operation() {
	   System.out.println("Hey I am a doctor, i am always ready to help you");
   }
}
public class Engineer extends Parent {
	public void coding() {
		System.out.println("Hey i am a Engineer, i can do coding for you");
	}

}
public class Pilot extends Parent {
   public void flyPlanes() {
	   System.out.println("Hey I am pilot, I can fly planes");
   }
}
