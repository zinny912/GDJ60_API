package com.iu.api1.objects;

public class ObjectStudy /*extends Object*/ {

	public static void main(String[] args) {
		// 객체 생성 공식
		Object object = new Object(); // 항상 생성자 확인하기
		
		
		//멤버 사용(접근)
		//참조변수명.변수명; , 참조변수명.메서드명();
		int a = object.hashCode();
		System.out.println(a);
		
		String str = object.toString();
		System.out.println(str);
		System.out.println(object);//object.toString();

		Child child = new Child();
		Object obj = new Object();
		System.out.println(object == obj);
		boolean check = object.equals(obj);
		System.out.println(check);
		
		System.out.println(child.toString());
		System.out.println(child);
		System.err.println(child.hashCode());
		
		Object o = child;//다형성
		
		
	}

}
