package com.iu.api3.exception;

public class ExceptionSample2 {
	
	public void ex2() {
		ExceptionSample1 e1 = new ExceptionSample1();
		ExceptionSample2 e2 = new ExceptionSample2();
		
		try {
			e2.ex2();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
