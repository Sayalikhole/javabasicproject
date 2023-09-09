/*write a program to,find whether character is vowel or consonant*/

package com;

import java.util.Scanner ;

public class TestChar {

	public static void main(String[] args) {
		
		
		char ch ;
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter a character");
		ch = sc.next().charAt(0) ;
		if(ch=='a'|| ch=='e' || ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'|| ch=='I'|| ch=='O'|| ch=='U' )
		{
			System.out.println(" it is a vowel" );
			
		}
		else
		{
			System.out.println(" it is a consonant") ;
			
		}
		
	
		
	}

}
