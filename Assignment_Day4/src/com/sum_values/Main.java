package com.sum_values;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		int sum=0;
		for(int i = 0;i<5;i++) {
			System.out.println("enter a number ");
			arr[i] = sc.nextInt();
			
		}
       for(int i = 0;i<5;i++) {
			System.out.println(arr[i]);
			
		}
       for(int i=0;i<arr.length;i++) {
       sum= sum + arr[i];
       System.out.println("sum is "+sum);
		
	}
	}

}
