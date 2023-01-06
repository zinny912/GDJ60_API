package com.iu.api1.strings;

public class StringStudy5 {

	public static void main(String[] args) {
		//String str = "991214-1234567";
		//String[] result = str.split("-");
		
		//String str = "1.2# 3.4, 5.2# 60"; //전처리 (기준점을 맞추기)
		
		String str = "apple# Apple, aPPle# appLe";
		
		
		str = str.replace(",", "#");
		
		//str = str.replace(" ",""); //문자의 공백없애기
		//str = str.trim(); 나눠진 문자의 공백없애기 // 앞 뒤 공백만 없애기가능 중간 공백은 못없앰 ex)1. 2, 3.4, 에서 1. 2 사이의 공백은 trim()으로 불가함
		
		String[] result = str.split("#"); //파싱(parsing) : 하나의 문자를 여러 문자로 나누는 작업
		
		for(int i=0; i<result.length;i++) {
			System.out.println(result[i].trim().toLowerCase());
		}

	}

}
