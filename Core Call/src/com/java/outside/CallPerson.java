package com.java.outside;

public class CallPerson {

	private static void call() {
		System.out.println("I am acessable in private ");
	}
	
	
	public static void main(String[] args) {
		
		
		CallPerson.call();
		
	}
}
