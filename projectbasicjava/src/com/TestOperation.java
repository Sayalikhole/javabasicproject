package com;

import java.util.Scanner ;

public class TestOperation {
	
	int countDigit(int no)
	{
		
		int count = 0;
		
		while(no>0)
		{ 
			count++ ;
			no=no/10 ;	
		}
		return count ;
	}
	
	int powerDigit(int no , int p)
	{
		
		int product = 1;
		for(int i=1;i<=p;i++)
		{
			product = product*no;
			
		}
		return product;
	}
	
	int findFactriol(int no2)
	{
		int fact = 1 ;
		for(int i=1;i<=no2;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	
	
	public static void main(String[] args) {
		
		TestOperation m = new TestOperation();
		
		int c ;
		
		Scanner sc = new Scanner (System.in) ;
		
		String str  ;
		
		do
		{
			System.out.println("1.No of digits");
			System.out.println("2.power of number");
			System.out.println("3.factorial");
			System.out.println("enter ur choice") ;
			c = sc.nextInt() ;
			
			switch(c)
			{
			
			case 1:
				int no , count=0;
				System.out.println("enter a no");
				no=sc.nextInt();
				count = m.countDigit(no) ;
				System.out.println("Count of didgits"+count);
				break ;
			
			case 2:
				int power;
				System.out.println("Enter no1");
				int no1 = sc.nextInt();
				System.out.println("Enter power");
				int p = sc.nextInt();
			
				
				 power =m.powerDigit(no1,p);
				System.out.println("power of no is :" +power);
				break;
				
			case 3 :
				System.out.println("Enter no2");
				int no2 = sc.nextInt();
				int factorial = m.findFactriol(no2);
				System.out.println("factorail is " +factorial);
				break;
			
				default:
					System.out.println("wrong choice");
					
			}
			
			System.out.println("do u want to continue if yes");
			str = sc.next();
			
		}while(str.equals("yes"));

	}

}
