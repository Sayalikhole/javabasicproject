package com;

class stoke {
	private long code ;
	private int qty ;
	private double price , total , discount , netprice ;
	
	public stoke(long n ,int q , double p)
	{
		code= n;
		qty =q;
		price= p;
		
	}
	
	public void compute()	
	{
		total = qty*price;
		discount = total*0.25;
		netprice = total-discount;
	}
	
	public void display() {
		System.out.println("Product code:"+code);
		System.out.println("Quantity:"+qty);
		System.out.println("price per unit:"+price);
		System.out.println("Total cost:"+total);
		System.out.println("discount:"+discount);
		System.out.println("net price to be paid:"+netprice);
		
	}
	
}

public class TestStoke {

	
	public static void main(String[] args) {
		stoke s =new stoke(101,5,100.50);
		s.compute();
		s.display();
	}

}
