package com.iu.api1.strings;

public class StringBuffer1 {

	public static void main(String[] args) {
		//StringBuffer는 String이 아님
		StringBuffer sb = new StringBuffer("Hello"); //hello
		
		//hello + world
		sb.append("world"); 
		
		System.out.println(sb); //원래는 sb의 메모리 주소가 나와야하는데, Helloworld 로 출력

		//원래는 참조변수를 출력하면, toString()이 호출됨 (toString():클래스명@객체주소)
		//toString의 내용을 변경, 즉 오버라이딩함 (오버라이딩 : 상속받은 메서드 재정의)
		//변수에는 같은 데이터타입만 대입가능
		//String str = sb; //str의 데이터타입 : String타입 // sb는 StringBuffer타입 => 같은 타입이 아님
		String str = sb.substring(0);
		str = sb.toString();
		
		System.out.println(str);
		
		sb.reverse();
		System.out.println(sb);
		
		//static String 타입으로 리턴
		//static 붙으면 객체생성없이 사용가능 클래스명.000
		str = String.valueOf(123);
		System.out.println(123);
		
		str = 123+""; //valueOf 없이 성립하는 방법, 대신 객체가 추가로 생성됨
	}
}
