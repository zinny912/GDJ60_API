package com.iu.api4.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		
		
		try {
			sc = new Socket("192.168.1.116",8282);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is= sc.getInputStream();
			ir= new InputStreamReader(is);
			br= new BufferedReader(ir);
			
			
			while(true) {
				System.out.println("1.점심 2.저녁 3.종료");
				int select = scanner.nextInt();
				bw.write(select+"\r\n");
				bw.flush();				
							
				if(select==3) {
					System.out.println("프로그램 종료");
					break;
				}
				String menu = br.readLine();
				System.out.println("오늘 메뉴는 : " +menu);
					
			}	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
			
		
		

	}

}
