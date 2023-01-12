package com.iu.api4.network;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {
		// 1.서버 접속 시도
		// 2. 1.점심, 2.저녁, 3.종료
		// 3. 1,2,3 고르기
		//클라이언트 1번 선택 : 서버에서 점심메뉴중 하나를 보내줌, 출력
		//2번 선택 : 서버에서 저녁메뉴중 하나를 보내줌, 출력
		//3번 선택 : 종료
		
		Scanner scanner = new Scanner(System.in);
		Socket sc = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		int select =0;
		
		try {
			sc = new Socket("192.168.1.116",8282);
			System.out.println("접속성공");
			
			while(true) {
			System.out.println("1.점심 2.저녁 3.종료");
			select = scanner.nextInt();
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(select+"\r\n");
			bw.flush();
			
			if(select==3) {
				break;
			}
					
		 }	
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
		

	}

}
