package com.missu.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.missu.cab.eng.Engine;
@Component
public class Car {

	@Autowired
	private Engine engine ;
	
	public Car(){
		System.out.println("hello dear");
	}
	
	public void printData() {
		System.out.println("engine"+engine.getModelyear());
	}
}
