package com.iu.api1.strings;

import java.util.Scanner;

public class StringStudy {

	public static void main(String[] args) {
		System.out.println(String.CASE_INSENSITIVE_ORDER);
		
		String str = new String("abc");
		String str2="abcdefghijklmnopqrstuv"; // 객체생성 new String();과 같음

		System.out.println(str2); //오버라이드 됨
		System.out.println(str==str2);//주소비교
		
		boolean check = str.equals(str2);
		System.out.println(check);
		
		
		char ch = str2.charAt(0);		
		System.out.println("char : "+ch);
		Scanner sc = new Scanner(System.in);
	//	ch =sc.next().charAt(0);
		
		
		int a = str2.indexOf('k',3);
		System.out.println("Num : "+a);
	}

}
