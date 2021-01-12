package com.simpli.TypeCasting;
public class TypeCasting {
 public static void main(String[] args) {
	char c = 'A';
	System.out.println("Implicit Type Casting:");
	//short and char takes same bytes
	//short s = c;
	int i = c;
	System.out.println("Value of i:"+i);
	
	long l = c;
	System.out.println("Value of l:"+l);
	
	float f = c;
	System.out.println("Value of f:"+f);
	
	double d = c;
	System.out.println("Value of d:"+d);
	
	System.out.println("Explicit Type Casting:");
	double d1 = 3444.4;
	int i1 = (int)d1;
	System.out.println(i1);
	
	float f1 = (float)d1;
	System.out.println(f1);
}
}
