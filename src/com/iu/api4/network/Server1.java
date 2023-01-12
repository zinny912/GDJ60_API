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
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ServerSocket ss = null;
		Socket sc = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
			
		boolean check = true;
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속을 기다리는 중");
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			
			while(true) {
			//0과 1을 처리
			is = sc.getInputStream();
			//char 문자를 처리
			ir = new InputStreamReader(is);
			//보조스트림 Stream 읽어들이는
			br = new BufferedReader(ir);
			
			String msg = br.readLine();
			if(msg.toUpperCase().equals("q")) {
				break;
			}
			System.out.println("Client : "+msg);
			
			//Client로 정보 보내기
						
			System.out.println("Client로 보낼 메세지 입력");
			msg = scanner.next(); //next();로 받으면 buffer에 입력되는 값을 스페이스나 \n을 만날때까지
				
					//nextLine()으로 받으면 buffer에 \n이 남아있어서 다음 입력을 받을때 /n때문에 두번째 입력값을 받을 수 없게됨
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			bw.write(msg+"\r\n");
			bw.flush(); //buffer를 강제로 비우기
			
			if(msg.toUpperCase().equals("q")) {
				break;
			}
			}	
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			//stream이 달라서 output을 먼저 받건, input을 먼저 받건 상관없음
			try {
				br.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				ss.close(); //server socket
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

		}

	}
}
