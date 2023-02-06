package com.example.dependencyinjectionwithxml;

public class ExampleForStateInjectionUsingConstrutorWithdepedentObject {
	 private int id;
     private String name;  
     private DependentObjectClassConstructorExample docce;
	public ExampleForStateInjectionUsingConstrutorWithdepedentObject(int id, String name,
			DependentObjectClassConstructorExample docce) {
		super();
		this.id = id;
		this.name = name;
		this.docce = docce;
	}
	@Override
	public String toString() {
		return " [id=" + id + ", name=" + name + ", docce="
				+ docce.toString() + "]";
	}
     
}
