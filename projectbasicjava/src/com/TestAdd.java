package com;

import java.util.Scanner ;

public class TestAdd {
	
	int a , b , c ;

	void input()
	{
		
		Scanner sc = new Scanner (System.in) ;
		
		System.out.println("Enter 1st no") ;
		a=sc.nextInt() ;
		
		System.out.println("Enter 2nd no") ;
		b=sc.nextInt() ;
			
	}
	
	void add()
	{
		
		c = a +b ;
		System.out.println("sum is "+c) ;
		
	}
	public static void main(String[] args) {
		
		TestAdd ob = new TestAdd();
		
		ob.input() ;
		ob.add();

	}

}
