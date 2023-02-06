package com.example.dependencyinjectionwithxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingSetter.xml");
		ExampleForStateInjectionUsingSetter example1 =(ExampleForStateInjectionUsingSetter) context1.getBean("example1");
		System.out.println(example1.getId() + " " +example1.getName());
		System.out.println( "This data we got using setter injection with states");
		ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingConstrutor.xml");
		ExampleForStateInjectionUsingConstrutor example2 =(ExampleForStateInjectionUsingConstrutor) context2.getBean("example2");
		System.out.println(example2.toString());
		System.out.println( "This data we got using constructor injection with states");
		ClassPathXmlApplicationContext context3 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingConstrutorWithdepedentObject.xml");
		ExampleForStateInjectionUsingConstrutorWithdepedentObject example3 =(ExampleForStateInjectionUsingConstrutorWithdepedentObject) context3.getBean("example3");
		System.out.println(example3.toString());
		ClassPathXmlApplicationContext context4 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingSetterWithdepedentObject.xml");
		ExampleForStateInjectionUsingSetterWithdepedentObject example4 =(ExampleForStateInjectionUsingSetterWithdepedentObject) context4.getBean("example4");
		System.out.println(example4.getData());
		ClassPathXmlApplicationContext context5 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingConstrutorCollection.xml");
		ExampleForStateInjectionUsingConstrutorCollection example5 =(ExampleForStateInjectionUsingConstrutorCollection) context5.getBean("example5");
		System.out.println(example5.getData());
		ClassPathXmlApplicationContext context6 = new ClassPathXmlApplicationContext("ExampleForStateInjectionUsingSetterCollection.xml");
		ExampleForStateInjectionUsingSetterCollection example6 =(ExampleForStateInjectionUsingSetterCollection) context6.getBean("example6");
		System.out.println(example6.getData());

	}

}
