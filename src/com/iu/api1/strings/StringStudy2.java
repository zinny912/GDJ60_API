package com.iu.api1.strings;

public class StringStudy2 {

	public static void main(String[] args) {
		String email = "a@bc@123@gmail.com";
		int idx = email.lastIndexOf("@");
		System.out.println(idx);
		
		System.out.println(email.length());
		
		for(int i =0; i<email.length();i++) {
			char ch = email.charAt(i);
		System.out.println(ch);
		}
		
		
		System.out.println("Before Email : "+email);
		email=email.replace("@", "_");
		System.out.println("After Email : "+email);
		
//		String str = " "; //객체 생성O
//		String str2 = null; // 객체 생성 X
//		
//		System.out.println("STR : "+str2.length()); // 에러뜸. 객체가 생성되어있지않아서

		
	}

}