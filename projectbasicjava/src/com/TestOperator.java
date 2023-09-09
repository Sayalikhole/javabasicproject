package com;

import java.util.Scanner ;

public class TestOperator {

	public static void main(String[] args) {
		
		int a , b , ch , s=0 ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter 1st number :") ;
		a = sc.nextInt() ;
		
		System.out.println("Enter 2nd number :") ;
		b = sc.nextInt() ;
		
		do
		{
			
			System.out.println("1. Add 2 numbers") ;
			System.out.println("2. Sub 2 numbers") ;
			System.out.println("3. Mul 2 numbers") ;
			System.out.println("4. Div 2 numbers") ;
			System.out.println("5. rem 2 numbers") ;
			System.out.println("Enter ur choice :") ;
			
			ch = sc.nextInt() ;
			
			switch(ch)
			{
				case 1:
					System.out.println("Addition Is :"+(a+b)) ;
					break ;
				
				case 2:
					System.out.println("Subtraction Is :"+(a-b)) ;
					break ;
				
				case 3:
					System.out.println("Multiplication Is :"+(a*b)) ;
					break ;
					
				case 4:
					System.out.println("Division Is :"+(a/b)) ;
					break ;
					
				case 5:
					System.out.println("Remainder Is :"+(a%b)) ;
					break ;	
					
				default:
						System.out.println("Wrong Choice") ;
						
			}
			
			System.out.println("Do u want to continue if YES press 1");
			s=sc.nextInt() ;
		
	}
	while(s==1) ;
	}
}
