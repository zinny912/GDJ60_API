package com.iu.api5.thread;

public class ThreadTest1 extends Thread {
	//Thread 상속받고
	
	
	//메뉴 source ->Override/implement에서 상속할 메서드 선택 하거나 
	@Override
	public void run() {
		this.t1();
		
	}
	
	//멤버메서드 준비
	public void t1() {
		
		for(int i =0; i<26; i++) {
			System.out.println("T1 : "+i);
			try {
				Thread.sleep(1000); //클래스 메서드
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		}
		
		
	}
	

}
