/*find sum of series 1,3,6,11.......terms*/

package com;

import java.util.Scanner ;

public class FindSum {
	public static int power (int n,int p)//USERDEFINED FUCTION
	{
		int r =1 ;
		for(int i=0;i<p;i++)
		{
			r=r*n;
		}
		return r;
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int terms = sc.nextInt();
		int series ;
		int sum=0;
		
		for(int i=0;i<terms;i++)
		{
			
			series=i+power(2, i); //USERDEFINED FUCTION FOR POWER

			//series=(int) (i+Math.pow(2, i)); INBUILT POWER FUNCTION
			
			System.out.println("series is :"+series);
			sum=sum+series;
			
		}
		System.out.println("\nsum is:\n"+sum);
	}

}
