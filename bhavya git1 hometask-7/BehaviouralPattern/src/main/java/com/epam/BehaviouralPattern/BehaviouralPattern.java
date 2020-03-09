package com.epam.BehaviouralPattern;

public class BehaviouralPattern {
	
		public static void main(String[] args) {
			System.out.println("Behavioural Pettern Examples");
			System.out.println();
			System.out.println();
			
			System.out.println("Implementing State Design Pattern");
			System.out.println();
			TVRemote tvRemote = new TVRemote();
			tvRemote.test();
			System.out.println();
			
			System.out.println("Implementing Strategy Design Pattern");
			System.out.println();
			ShoppingCartTest shoppingCartTest = new ShoppingCartTest();
			shoppingCartTest.test();
		}

	}


