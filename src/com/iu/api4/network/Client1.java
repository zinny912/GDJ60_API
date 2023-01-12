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

public class Client1 {

	public static void main(String[] args) {
		//상대방의 IP와 Port번호 : socket
		Socket socket = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Scanner scanner = new Scanner(System.in);
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;

		
			try {
				//객체 생성시 서버 접속 시도
				socket = new Socket("192.168.1.116",8282);
				System.out.println("Sever 접속 성공");
				
				while(true) {
				//0과1을 바꿔주는
				os = socket.getOutputStream();
				//char 문자로 변경
				ow = new OutputStreamWriter(os);
				//Stream 문자열로 바꾸는 보조스트림
				bw = new BufferedWriter(ow);
			
				System.out.println("서버로 보낼 메세지 입력");
				String msg = scanner.next();
															
				//msg를 0과1로바꿔서
				bw.write(msg+"\r\n");
				bw.flush();
				
				if(msg.toUpperCase().equals("q")) {
					break;
				}
								
				is = socket.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
			
				msg = br.readLine();
				
				if(msg.toUpperCase().equals("q")) {
					break;
				}
				System.out.println("Server : "+msg);
					
			}									
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			} finally {
				//stream이 달라서 output을 먼저 받건, input을 먼저 받건 상관없음
			
				try {
					br.close();
					ir.close();
					is.close();
					bw.close();
					ow.close();
					os.close();
					socket.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
		//0~65535
		//127.0.0.1 은 본인컴퓨터 IP
		//localhost 본인컴퓨터
		//ip는 장소에 따라 변경되니까, localhost나 127.0.0.1사용

		}

	}

