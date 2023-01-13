package com.iu.api4.network.ex.clients;

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
import java.net.Socket;
public class ClientMain {

	public static void main(String[] args) throws Exception {
		
//		Socket socket;
//		
//		socket = new Socket("127.0.0.1",8282);
//			
//		InputStream is = null;
//		InputStreamReader ir = null;
//		BufferedReader br = null;
//		
//		OutputStream os = null;
//		OutputStreamWriter ow = null;
//		BufferedWriter bw = null;
//		
//		Scanner scanner;
//		
//		System.out.println("접속성공");
//		
//		os = socket.getOutputStream();
//		ow = new OutputStreamWriter(os);
//		bw = new BufferedWriter(ow);
//		
//		is= socket.getInputStream();
//		ir= new InputStreamReader(is);
//		br= new BufferedReader(ir);	
//			
//		//번호:data
//		bw.write("1:\r\n");
//		bw.flush();
//		
		new Controller().start();

		
	}
 }
