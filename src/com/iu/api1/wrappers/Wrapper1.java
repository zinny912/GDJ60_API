package com.iu.api1.wrappers;

public class Wrapper1 {

	public static void main(String[] args) {
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		String n1 = "12";
		Integer int1 = new Integer(n1); //문자열을 숫자로 변경하려고 하는데.. 미래버전에서 삭제될 코드라서 될 수 있으면 사용하지 말아라

		int num1 = Integer.parseInt(n1); // 숫자형식의 문자열만 변환 가능
		System.out.println(num1*2);
		
		n1 = "15.323";
		double d1 = Double.parseDouble(n1);
		System.out.println(d1*1.1);
		
	}

}
