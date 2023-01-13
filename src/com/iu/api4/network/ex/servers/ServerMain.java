package com.iu.api4.network.ex.servers;

import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args) {
		// 프로그램 시작, Test
		
		//초기화 메서드 정상작동하는지 Test
//		try {
//			ArrayList<StudentDTO> ar = new StudentDAO().init();
//			System.out.println(ar.size());
//			System.out.println(ar.get(1).getName());
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//ar을 문자로 출력하게하기 -> controller클래스
		
		try {
			new StudentController().start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}

}
