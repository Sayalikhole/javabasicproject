package com;

import java.util.Scanner ;

public class Test
{
	int num ;
	int input()
	{
		
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter a no.") ;
		num= sc.nextInt();
		return(num);
	}


	public static void main(String[] args)
	{
	
		Test ob = new Test();
		ob.input();
	}
}