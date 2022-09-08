package com.exercise.pll;

import java.util.Scanner;

import com.exercise.bll.CountDigits;

public class TestCountDigit {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);

		CountDigits cd = new CountDigits();
		
		System.out.println("Enter a number :");
		int num=input.nextInt();
		
		if(num>0){
			System.out.println("Total Digits : "+ cd.countDigits(num));
		}
		else
			System.out.println("Please enter a positive number");
	}
}
