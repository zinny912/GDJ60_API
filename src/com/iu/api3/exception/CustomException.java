package com.iu.api3.exception;

public class CustomException extends Exception {
	//Exception 클래스 상속받아서 예외 클래스가 됨
		
	public CustomException() {
		//상속받으면 부모객체만들고 본인을 확장
		//super( )생략되어있음
	}
	
	public CustomException(String message) {
		super(message);
		
	}
	
	

}
