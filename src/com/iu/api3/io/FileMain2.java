package com.iu.api3.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileMain2 {

	public static void main(String[] args) {
		File file = new File("C:\\fileTest", "test.txt");
		System.out.println(file.exists());
		
		//파일에 내용을 작성
		String name = "Suji";
		
		try {                         //boolean 타입 append가 true면 하나더 입력
			FileWriter fw = new FileWriter(file,true);
			 
			
			fw.write(name+"\r\n");//\r 뒤로땡겨 // 비울때 세트로 사용 \r\n
			fw.flush();//강제로 버퍼를 비우기
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
