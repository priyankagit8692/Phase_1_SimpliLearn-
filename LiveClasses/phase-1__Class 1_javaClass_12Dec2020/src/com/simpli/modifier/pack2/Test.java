package com.simpli.modifier.pack2;

import com.simpli.modifier.pack1.PublicAccessSpecifier;
import com.simpli.modifier.pack3.PrivateAccessModifer;

public class Test {
	public static void main(String[] args) {
		//DefAccessSpecifier is accessable within same package due to default scope
		
		PublicAccessSpecifier pAccess = new PublicAccessSpecifier();
		//pAccess.display(); is default scope so it cannot be accesed outside package
		pAccess.display1();
		
		PrivateAccessModifer privateAccess = new PrivateAccessModifer();
		//privateAccess.welcome as it is private scope it cannot be acces outside package
		
	}

}
