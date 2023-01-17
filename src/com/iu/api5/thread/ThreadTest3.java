package com.iu.api5.thread;

//						implements 추상메서드 생성
public class ThreadTest3 implements Runnable {
	
	@Override
	public void run() {
		this.t3();
		
	}
	
	
	//해당클래스 내에서만 접근가능한 메서드 
	private void t3() {
		for(int i=0; i<25;i++) {
			System.out.println("Hello : "+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}

}
