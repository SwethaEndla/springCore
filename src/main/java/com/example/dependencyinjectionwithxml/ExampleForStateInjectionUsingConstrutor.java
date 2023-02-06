package com.example.dependencyinjectionwithxml;

public class ExampleForStateInjectionUsingConstrutor {
	 private int id;
     private String name;
	public ExampleForStateInjectionUsingConstrutor(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name +  "]";
	}
	
	 
}
