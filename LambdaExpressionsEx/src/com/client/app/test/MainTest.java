package com.client.app.test;

import com.client.app.resources.Eatable;

public class MainTest {
	public static void main(String[] args) {
		System.out.println("MainTest.main().start");
		
		Eatable eatable = new Eatable() {

			@Override
			public void eat() {
				System.out.println("MainTest.enclosing_method()");
			}
		};
		
		eatable.eat();
		System.out.println("MainTest.main().end");
	}

}
