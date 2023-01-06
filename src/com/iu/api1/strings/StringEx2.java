package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명");
		String fileName = sc.next(); // ******.jpg 
		//이미지파일이면 정상적인파일, 이미지파일이 아니면 정상적인 파일이 아니다
		String result = fileName.substring(fileName.lastIndexOf(".")+1);
		
		for(int i=0;i<names.length;i++) {
		if(result.equals(names[i])) {
			System.out.println("정상적인 파일입니다.");
			break;
		}else {
			System.out.println("비정상적인 파일입니다.");
			
		}
		}
		

	}

}
