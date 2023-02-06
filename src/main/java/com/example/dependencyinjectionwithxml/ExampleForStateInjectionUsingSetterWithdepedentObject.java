package com.example.dependencyinjectionwithxml;

public class ExampleForStateInjectionUsingSetterWithdepedentObject {
	private int id;
    private String name;  
    private DependentObjectClassSetterExample docse;
    
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public DependentObjectClassSetterExample getDocse() {
		return docse;
	}
	public void setDocse(DependentObjectClassSetterExample docse) {
		this.docse = docse;
	}
	
	public String getData() {
		return "id : "+ getId() + " name :" + getName() + " address: " + getDocse().getAddress();
	}
	
}
