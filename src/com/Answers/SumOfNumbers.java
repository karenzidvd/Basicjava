package com.Answers;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number;
		int digit;
		int sum = 0;  
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		number = sc.nextInt();  
		
		while(number > 0)  
		{  
		digit = number % 10;  
		sum = sum + digit;  
		number = number / 10;  
		}  
		System.out.println("Sum of Digits: "+sum);  
		}  
	}


