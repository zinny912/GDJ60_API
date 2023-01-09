package com.iu.api1.wrappers.ex1;

public class JuminCheck {
	
	//check1
	//주민등록번호를 받아서 
	//남성인지 여성인지 출력
	
	public void check1(String jumin) {
		//991223-1234567
		//1. 
		//jumin.charAt(7);
		String check = jumin.substring(7,8);
		
		//2.
		if(check.equals("1") || check.equals("3")) {
			System.out.println("남성");
		}else {
			System.out.println("여성");
		}
		
		//3.
//		int c = Integer.parseInt(check);
//		if(c==1 || c==3) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
		//4.
//		if(c%2==1) {
//			System.out.println("남자");
//		}else {
//			System.out.println("여자");
//		}
		
	}
	
	//check2
	//주민등록번호를 받아서
	// 나이를 계산
	// 3~5월 : 봄
	// 6~8월 : 여름
	// 9~11월: 가을
	// 12~2월 : 겨울
	
	public void check2(String jumin) {
		//991223-1234567
		//1.나이계산
		//substring 사용
		String y = jumin.substring(0,2); //99
		String check = jumin.substring(7,8);
		int year = 1900;
		//String year ="19"
		if(check.equals("3")||check.equals("4")) {
			year=2000;
			//year="20"
		}
			
		year = year + Integer.parseInt(y);
		int age = 2023-year;
		System.out.println("Age : "+age);
		
		//2.계절출력
		String m = jumin.substring(2,4);
		//문자열로 조건식 다 작성하는 것보다 int 타입으로 변환해서 크기 비교하는게 더 조건식 쓰기에도 보기에도 편리
		int month = Integer.parseInt(m);
				
		if(month>=3 && month<=5) {
			System.out.println("봄");
		}else if(month>=6 && month<=8) {
			System.out.println("여름");
		}else if(month>=9 && month<=11) {
			System.out.println("가을");
		}else {
			System.out.println("겨울");
		}
	}
		
}

