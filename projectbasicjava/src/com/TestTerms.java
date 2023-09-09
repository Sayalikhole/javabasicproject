/*find sum of series 1,11,111.......terms*/

package com;

import java.util.Scanner ;

public class TestTerms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int terms = sc.nextInt();
		int temp = 1;
	
		int sum = 0 ;
		
		while(terms>0) 
		{
			System.out.print(temp+",");
			temp=(temp*10)+1;
			sum=sum +temp;
			--terms;	
		}
		System.out.println("\n sum is \n"+sum);
	}

}
