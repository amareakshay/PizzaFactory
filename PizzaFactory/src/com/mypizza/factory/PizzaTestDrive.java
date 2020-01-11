package com.mypizza.factory;

public class PizzaTestDrive {

	public static void main(String[] args) {
		NYPizzaStore nyPizzaStore = new NYPizzaStore();
		ChicagoPizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		System.out.println("Ordered NY Style Cheese Pizza ....");
		nyPizzaStore.orderPizza("Cheese");
		
		System.out.println("Ordered Chicago Style Cheese Pizza ....");
		chicagoPizzaStore.orderPizza("Cheese");

	}

}
