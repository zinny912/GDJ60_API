package com.iu.api3.exception;

public class ExceptionMain2 {

	public static void main(String[] args) {
		
		ExceptionSample1 e1= new ExceptionSample1();
		
		try {
			e1.ex2();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage()); //
		}
		System.out.println("종료합니다");
		
	}

}
