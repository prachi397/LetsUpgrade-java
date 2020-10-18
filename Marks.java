package com.Marks;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        Marks m = new Marks();
			m.display_Marks();
			m.get_grade();
		}
	}


public class Marks {
	Scanner sc = new Scanner(System.in);
	int maths;
	int science;
	int english;
	int history;
	int computer;
	int total_marks_percentage;
	public void display_Marks() {
	System.out.println("enter the maths marks ");
	maths = sc.nextInt();
	System.out.println("enter the science marks");
	science = sc.nextInt();
	System.out.println("enter the english marks ");
	english = sc.nextInt();
	System.out.println("enter the history marks ");
	history = sc.nextInt();
	System.out.println("enter the computer marks ");
	computer = sc.nextInt();
	total_marks_percentage = ((maths + science + english + history + computer)*100)/500 ;
	System.out.println("you got "+total_marks_percentage+ " percent marks");
	}	
	public void get_grade() {
		if (total_marks_percentage >= 85){
			System.out.println("Your grade is A");
		}
			else if(total_marks_percentage>=70 && total_marks_percentage<80) {
			 System.out.println("Your grade is B");
			}
			else if(total_marks_percentage>=50 && total_marks_percentage<70) {
				 System.out.println("Your grade is c");
				}
			else {
				System.out.println("You fail, please study");
			}
		}
	}



