package com.mypizza.factory;

public class ChicagoPizzaStore extends PizzaStore{
	
	@Override
	public Pizza createPizza(String type) {
		if (type.equals("Cheese")) {
			return new ChicagoStyleCheesePizza();
		} else return null;
	}
}
