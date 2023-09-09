/*write a program to,find max number between 3 given no using =conditional operator*/

package com;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
	
		
		
		int a , b ,c , max ;
		
		Scanner sc = new Scanner(System.in) ;
		
		
		System.out.println(" Enter 1st number") ;
		a=sc.nextInt();
		
		System.out.println(" Enter 2nd number") ;
		b=sc.nextInt();
		
		System.out.println(" Enter 3rd number") ;
		c=sc.nextInt();
		
		max = a>b?(a>c?a:c):(b>c?b:c) ;
		
		System.out.println(" Maximum number is :" +max) ;
		

	}

}
