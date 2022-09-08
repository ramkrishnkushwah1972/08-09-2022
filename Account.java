package com.exercise.bll;
import java.util.Scanner;

public class Account {
	
	private static final int atm=1231;
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int i;
		for(i=1; i<4; i++)
		{
			System.out.println("Enter a four digit password");
			int psw=input.nextInt();
			if(atm==psw)
			{
				System.out.println("Correct, welcome back ");
				break;
			}
			else
			{
				if(i==3)break;
				System.out.println("Incorrect, try again");
			}
		}
		if(i==3){
			System.out.println("Sorry but you have been locked out");
		}
		
	}
	

}
