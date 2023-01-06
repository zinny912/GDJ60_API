package com.iu.api1.strings;

public class StringStudy4 {

	public static void main(String[] args) {
		String str = "StarWars";
		
		String result = str.substring(4); //index 4부터 끝까지 출력
		System.out.println("Result: " +result);
		result = str.substring(4,6); //index 4부터 6번미만까지 출력 / substring(4,5);로 하게되면 4번 index값만 출력됨
		System.out.println("Result2: "+result);
		
		str = "wlqrkrhtlvdjdy@naver.com";
		
		//naver.com을 출력하고 싶음
		//int a = str.lastIndexOf("@"); // ↓ 에 직접기입하면 불필요한 변수를 줄일 수 있음...
		result = str.substring(str.indexOf("@")+1).toString(); //== result.toString();
		System.out.println(result);	
	}

}
