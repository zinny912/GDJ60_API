package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
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
		
		String [] lunch = {"김치나베돈까스", "제육덮밥", "순두부찌개", "마라탕","떡볶이"};
		String [] dinner = {"삼겹살+소주", "방어회", "치킨+맥주", "닭가슴살", "닭발"};
		boolean check = true;
		ServerSocket ss = null;
		
				//받기
				InputStream is = null;
				InputStreamReader ir = null;
				BufferedReader br = null;
				
				//내보내기
				OutputStream os = null;
				OutputStreamWriter ow = null;
				BufferedWriter bw = null;
		
		
		try {
			ss= new ServerSocket(8282);
			Socket sc =ss.accept();
		
			//상대방이 접속하면 serverSocket이 받고, 접속한 클라이언트 정보로 new Socket해서 리턴
			//java에서 일대일 통신하는거 socket
			is= sc.getInputStream();
			ir= new InputStreamReader(is);
			br= new BufferedReader(ir);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
		
		
		while(check) {
			//네트워크로 받는건 전부다 String★★★★★★★★★★★★★★★★★
			String data = br.readLine();
			int select = Integer.parseInt(data);
			
			Calendar ca = Calendar.getInstance(); //랜덤을 while문안에 넣어도 되고 안넣어도됨
			Random random = new Random(ca.getTimeInMillis());
			
			String menu = null;
			
			switch (select) {
			case 1: 			
				//int num = random.nextInt(5)-> 기본
				select = random.nextInt(100)%5;//좀 더 큰 랜덤으로 뽑게하기
				menu = lunch[select];
				break;
		
			case 2:
				select = random.nextInt(100)%5;//좀 더 큰 랜덤으로 뽑게하기
				menu = dinner[select];
				break;
			
			default:
				System.out.println("서버 프로그램을 종료 합니다");
				check=!check;
			}
			
			if(check) {
				bw.write(menu+"\r\n");
				bw.flush();
			}
		}	
						
			}catch(Exception e) {
				e.printStackTrace();
			}
		
			
	}

}
