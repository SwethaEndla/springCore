package com.example.dependencyinjectionwithxml;

import java.util.*;

public class ExampleForStateInjectionUsingConstrutorCollection {
	
	private List<Integer> list ;
	private Set<String> set ;
	private Map<Integer , String>  map;
	public ExampleForStateInjectionUsingConstrutorCollection(List<Integer> list, Set<String> set,
			Map<Integer, String> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}
	public String getData() {
		return "list : "+list + " set :" + set + " map :" + map;
		
	}

}
