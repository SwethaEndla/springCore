package com.example.dependencyinjectionwithxml;

public class DependentObjectClassConstructorExample {
           private String address;

		public DependentObjectClassConstructorExample(String address) {
			super();
			this.address = address;
		}

		@Override
		public String toString() {
			return " [address=" + address + "]";
		}
           
}
