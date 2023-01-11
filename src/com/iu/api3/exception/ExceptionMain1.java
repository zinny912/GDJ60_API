package com.iu.api3.exception;

import java.util.Random;

public class ExceptionMain1 {

	public static void main(String[] args) {
		String num = null;
		Random random = new Random();
		int n = random.nextInt(2);
		if(n==0) {
			num="test";
		}
		//예외처리
		try {//예외가 발생할 영역→
			int a =10;
			System.out.println(3/n);
			//throw new ArithmeticException();
			System.out.println(num.charAt(0));
			//throw new NullPointerException();
		//←예외가 발생할 영역
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("예외발생");
			int a=100;
		}catch(RuntimeException e) {
			e.printStackTrace();
			System.out.println("Null Point Exception 발생");
		}catch (Exception e) {
		//모든 예외를 처리
		}catch (Throwable e) {
			// TODO: handle exception
		}
		//System.out.println(a);
		//Excetpion : 실행이 될 때도 있고, 안될때도 있음 / 예외, 실행중 발생하는 에러
		//compile error : 개발자가 고칠 수 있음
		
		System.out.println("종료합니다");
		
		
	}

}
