package com.tns.exceptionhandling;

public class Exec {
	public static void main(String[] args) {
		try {
			User.validate();
		}
		catch(Age e)
		{
			System.out.println("caught exception"+e.getMessage());
		}
	}

}
