package com.example.dependencyinjectionwithxml;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ExampleForStateInjectionUsingSetterCollection {
	private List<Integer> list ;
	private Set<String> set ;
	private Map<Integer , String>  map;
	
	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	public String getData() {
		return "list : "+list + " set :" + set + " map :" + map;
		
	}

}
