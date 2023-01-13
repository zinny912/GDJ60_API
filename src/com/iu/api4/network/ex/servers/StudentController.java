package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class StudentController {
	
	private ServerSocket ss;
	private Socket socket;
	private StudentDAO studentDAO;
		
	public void start() throws Exception {
	
		ss = new ServerSocket(8282); //포트번호입력
		//serverSocket 에 대한 예외 관련해서 try catch 나오는데, throws던져서 다른데서 해결하게끔.설정
		//System.out.println("adadfwragdszdfz"); 연결잘 됐는지 테스트
		
		socket = ss.accept();
		studentDAO = new StudentDAO();
		ArrayList<StudentDTO> ar = studentDAO.init(); //데이터 초기화
		
		//받기
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		//내보내기
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		is= socket.getInputStream();
		ir= new InputStreamReader(is);
		br= new BufferedReader(ir);
		
		os = socket.getOutputStream();
		ow = new OutputStreamWriter(os);
		bw = new BufferedWriter(ow);
	
		boolean check = true;				
		while(check) {
			String select = br.readLine(); //선택번호?data
			String [] s = select.split(":");
			
			//선택번호는 항상 s[]의 0번인덱스
			switch(s[0]) {
			case "1":
				select = studentDAO.makeList(ar);
				break;
				
			case "2":
				
				break;
			case "3":
				
				break;
			case "4":
				
				break;
				
			default:
				check=false;
			
				
			}
			if(check) {
				bw.write(select+"\r\n");
				bw.flush();
			}
	
		
		}
	}

}
