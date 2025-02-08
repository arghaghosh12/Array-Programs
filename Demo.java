package com;

class Demo {
	public static void main(String[] args) {
	
		//Array Declaration
		int a[];
		
		//Array Creation
		a=new int[3];
		
		//printing array elements
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[0]+" "+a[1]+" "+a[2]);
		System.out.println("Length: "+a.length);
		System.out.println("---------");
		
		
		// array initialization
		 a[0]=10;
		 a[2]=50;
		 
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println("Length: "+a.length);
		System.out.println("---------");
		
		//array declaration and creation
		
		double x[]= new double[2];
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("Length: "+x.length);
		
		x[0]=1.1;
		x[1]=2.2;
		System.out.println(x[0]);
		System.out.println(x[1]);
		System.out.println("---------");
		
		
		
}
}
