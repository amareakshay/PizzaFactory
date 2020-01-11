package com.mypizza.factory;

public class ChicagoStyleCheesePizza extends Pizza {
	public ChicagoStyleCheesePizza() {
		name="ChicagoStyleCheezePizza";
		sauce="Marinara Sauce";
		dough="Thin crust";
		toppings.add("Grated reggiano cheese");
		toppings.add("Dried tomatoes");
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting into square slices");
	}

}
