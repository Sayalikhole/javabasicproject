
package com;

import java.util.Scanner ;

public class TestSum {

		public static void main(String[] args) {
			
			int num1 , num2 ;
			Scanner sc = new Scanner(System.in) ;
			
			System.out.println("Enter 1st number ") ;
			num1 = sc.nextInt();
			
			System.out.println("Enter 2nd number ") ;
			num2 = sc.nextInt();
			
			int sum = num1 + num2 ;
			System.out.println("sum is " +sum) ;
			
		}

	}


