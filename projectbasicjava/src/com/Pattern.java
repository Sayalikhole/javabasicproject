/*pattern A
		  A B
		  A B C
		  A B C D*/

package com;

import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n=sc.nextInt();
		int k=65 ;
		
		for(int i=1;i<=n;i++)
			{
				;
				for(int j=1;j<=i;j++)
				{
					System.out.print((char)k+"\t");
					k++;
				}
				System.out.println();
			}
			
	}

}
