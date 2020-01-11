package com.mypizza.factory;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese" : return new ChicagoStyleCheesePizza();
							break;
			case "veggie" : return new ChicagoStyleCheesePizza();
							break;
			case "clam" : return new ChicagoStyleCheesePizza();
							break;
			case "pepperoni" : return new ChicagoStyleCheesePizza();
							break;
			default  : System.out.println("Invalid pizza type passed");
							break;
		}
	}
}
