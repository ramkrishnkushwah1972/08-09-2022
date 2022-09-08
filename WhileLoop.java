package com.exercise.bll;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int evenSum=0;
		int oddSum=0;
		String even="";
		String odd="";
		
		System.out.println("Enter first number :");
		int fnum = input.nextInt();
		System.out.println("Enter second number :");
		int snum = input.nextInt();
		
		if(fnum>0 && snum>0){
			if(fnum<snum)
			{
				for(int i = fnum; i <= snum; i++)
				{
					if(i % 2 == 0)
					{
						even+=i;
						evenSum = evenSum + i;
					}
					else{
						odd+=i;
						oddSum = oddSum + i;
					}
				}
				System.out.println("Even numbers :"+even);
				System.out.println("Odd numbers :"+odd);
				System.out.println("*************************************************");
				System.out.println("Sum of Even Numbers : " + evenSum);
				System.out.println("Sum of Odd Numbers : "+ oddSum);
			}
			else{
				System.out.println("Note! : first number must be smaller than second number ");
			}	
			}
		else
		{
			System.out.println("Please enter positive number, try again");
		}
	}
}
