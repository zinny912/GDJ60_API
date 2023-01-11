package com.iu.api3.exception;

import java.util.Random;

public class ExceptionSample1 {
	
	public void ex2() throws Exception {
		//2자리까지만 읽을 수 있음
		int num1 = 65;
		int num2 = 48;
		//int sum = num1+num2;
		
		int sum = num2-num1;
		if(sum<0) {
			throw new CustomException("음수는 읽을 수 없어요");
			
		}
		
		
		if(sum>99) {
			//throws는 메서드 선언부에서 사용
			throw new CustomException("세자리수는 몰라요");
		}
		
		
	}

	//throws 메서드 선언부에서 선언, 예외객체타입 리턴받는 개념으로 이해
	public void ex1() throws ArithmeticException, NullPointerException, Exception{
		Random random = new Random();
		int num = random.nextInt(2);
		
		num = 10/num;
		
		System.out.println(num);
	}

}
