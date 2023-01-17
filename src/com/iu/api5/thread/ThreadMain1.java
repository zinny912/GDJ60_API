package com.iu.api5.thread;

public class ThreadMain1 {
	//ThreadTest1 tt1; 객체선언, 객체 선언 후 객체초기화(객체값설정)꼭!! 해줘야함 안해주면 NullPointException에러발생
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1(); //tt1 지역변수 , 사용전 초기화
		ThreadTest2 tt2 = new ThreadTest2();
		ThreadTest3 tt3 = new ThreadTest3();
		ThreadTest4 tt4 = new ThreadTest4();
		
		//tt1.t1(); //메서드 호출
		//tt2.t2();
		
		//thread 사용, 운영체제에게 작동요청..? -> 실행할 클래스를 thread에 상속시킨 후 
		
		tt1.start(); //OS에게 위임
		tt2.start(); //OS에게 위임
		
		//start() 메서드는 thread에만 있음
		
		//runable 인터페이스 타입으로 만든 tt3, tt4는 Thread 객체생성을 추가로 해줘야함
		Thread tr1 = new Thread(tt3); 
		Thread tr2 = new Thread(tt4);
		
		tr1.start();
		tr2.start();
		
		
		
		
	}

}
