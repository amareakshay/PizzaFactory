package com.mypizza.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	String name;
	String dough;
	String sauce;
	List<String> toppings=new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preparing " + name);
		System.out.println("Tossing dough " + dough);
		System.out.println("Adding sauce " + sauce);
		toppings.forEach(item -> System.out.println("Adding topping " + item));
	}
	
	public void bake() {
		System.out.println("Baking the pizza for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza in diagonal slices");
	}
	
	public void box() {
		System.out.println("Boxing the pizza");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		//code to print pizza should go here
		String myString="Nothing Added as of yet";
		return myString;
	}
	
}
