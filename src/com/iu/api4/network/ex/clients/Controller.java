package com.iu.api4.network.ex.clients;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Controller {
	
	Socket socket=null;
	
	InputStream is = null;
	InputStreamReader ir = null;
	BufferedReader br = null;
	
	OutputStream os = null;
	OutputStreamWriter ow = null;
	BufferedWriter bw = null;
	
	Scanner scanner;
		

	public void start() {
		scanner = new Scanner(System.in);
		
		boolean check = true;
		try {	
			socket = new Socket("192.168.1.138",8282);
			System.out.println("접속성공");
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is= socket.getInputStream();
			ir= new InputStreamReader(is);
			br= new BufferedReader(ir);
		
		while(check) {
			System.out.println("1.전체학생정보출력");
			System.out.println("2.학생정보검색출력");
			System.out.println("3.학생정보추가");
			System.out.println("4.학생정보삭제");
			System.out.println("5.종료");
			
			String data = scanner.next();
			int select = Integer.parseInt(data);
						
				if(select==5) {
				System.out.println("프로그램 종료");
				break;
		}
			String num = null;	
			String str = null;	
			switch(select) {
			
				case 1:
					System.out.println("전체학생정보 출력");
					num = br.readLine();
					StringTokenizer st = new StringTokenizer(num,"-");
					
					System.out.println(st);
					
					
					
					System.out.println(num);
					
					break;
				case 2:
					System.out.println("학생정보검색 출력");
					str = scanner.next();
					//2,winter
					bw.write(str+"\r\n");
					bw.flush();	
					System.out.println(num);
					break;
				case 3:
					System.out.println("학생정보추가");
					
					str = scanner.next();
					//winter,6,50,70,80
					bw.write(str+"\r\n");
					bw.flush();	
					break;
				case 4:
					System.out.println("학생정보삭제");
					str = scanner.next();
					//4,winter
					bw.write(str+"\r\n");
					bw.flush();	
					System.out.println();
			
				default:
					num=br.readLine();
					System.out.println("프로그램 종료");
					check=!check;
			}
				if(check) {
					bw.write(select+"\r\n");
					bw.flush();			
			}	
		} 
		}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
			
	}
}
