package com;

import java.util.Scanner ;

public class TelephoneBill {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enrer no of calls");
		int call = sc.nextInt();
		double totalbill =0.0 ;
		
		if(call<=80)
		{
			totalbill=call*(2.50);
			
		}
		else if (call>80 && call<=160)
		{
			totalbill=(80*2.50) + ((call-80)*(0.60));
		}
		else if(call>160 && call<=320)
		{
			totalbill=((80*2.50) + ((80)*(0.60))+((call-160)*0.50));
		}
		else 
		{
			totalbill=((80*2.50) + ((80)*(0.60))+((call-160)*0.50)+((call-320)*0.40));
		}
		System.out.println(totalbill);
	}

}
