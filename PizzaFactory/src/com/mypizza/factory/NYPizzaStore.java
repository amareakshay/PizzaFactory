package com.mypizza.factory;

public class NYPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese" : return new NYStyleCheesePizza();
							break;
			case "veggie" : return new NYStyleCheesePizza();
							break;
			case "clam" : return new NYStyleCheesePizza();
							break;
			case "pepperoni" : return new NYStyleCheesePizza();
							break;
			default  : System.out.println("Invalid pizza type passed");
							break;
		}
	}
}
