package com.odd_values;

public class Main {
	

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("Odd values are: ");
		for(int i=0;i<5;i++) {
		if(arr[i]%2 != 0) {
			System.out.println(arr[i]);
			i++;
		}
	}
	}

}
