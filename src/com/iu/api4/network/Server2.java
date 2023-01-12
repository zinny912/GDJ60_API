package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

public class Server2 {

	public static void main(String[] args) {
		// Client접속 대기
		// 1번이면 점심메뉴중에서 하나를 랜덤하게 골라서 전송
		// 2번이면 저녁메뉴중에서 하나를 랜덤하게 골라서 전송
		// 3번이면 종료
		Calendar ca = Calendar.getInstance();
		Random random = new Random(ca.getTimeInMillis());
		String [] lunch = {"김치나베돈까스", "제육덮밥", "순두부찌개", "마라탕","떡볶이"};
		//int num = random.nextInt(5)-> 기본
		int num = random.nextInt(100)%5;//좀 더 큰 랜덤으로 뽑게하기
		String menu = lunch[num];
		
		String [] dinner = {"삼겹살+소주", "방어회", "치킨+맥주", "닭가슴살"};
		int num2 = random.nextInt(100)%4;
		String menu2 = dinner[num2];
		
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		try {
			ss= new ServerSocket(8282);
			System.out.println("Client접속을 기다리는 중");
			sc=ss.accept();
			System.out.println("접속성공");
			
			is= sc.getInputStream();
			ir= new InputStreamReader(is);
			br= new BufferedReader(ir);
			
			String select = br.readLine();
			System.out.println("Client : "+select);
					
					
			while(true) {	
			if(select.equals("1")) {
				System.out.println(menu);
				break;
			}else if(select.equals("2")) {
				System.out.println(menu2);
				break;
			}else {
				System.out.println("종료");
				break;
			}
			}	
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
