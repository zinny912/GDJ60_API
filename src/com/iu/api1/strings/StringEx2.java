package com.iu.api1.strings;

import java.util.Scanner;

public class StringEx2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		Scanner sc = new Scanner(System.in);
		String [] names = {"jpg","jpeg","gif","png"};
		System.out.println("파일명");
		String fileName = sc.next(); // abc.jpg 
	
		//이미지파일이면 정상적인파일, 이미지파일이 아니면 정상적인 파일이 아니다
		int idx = fileName.lastIndexOf(".");
		String result = fileName.substring(idx+1);
		System.out.println(result);
		
		//반복문 안에서 if else 가 반복적으로 일어나기 때문에, 비정상적인 파일입니다 문구가 여러번 나오게 됨. 
		//한번씩만 나오게 하는 방법
		boolean flag = true;
		//확장자가 이미지인지 검증
		for(int i=0;i<names.length;i++) {
			if(result.equals(names[i])) {
				System.out.println("정상적인 파일입니다.");
				//반복문을 멈추는 방법
				//1. 
				//i=names.length;
				//2. 보조문 사용
				//break;
				flag=!flag;
				//flag = false;
				//break;
			}
		}
			if(flag) {
				System.out.println("비정상적인 파일입니다.");
			}
			System.out.println("프로그램 종료");
			
		}
	
		
		

}

