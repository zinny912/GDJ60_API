package com.iu.api1.strings;

public class StringStudy3 {

	public static void main(String[] args) {
		//String은 불변
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str1==str2); // true
		System.out.println(str3==str4); // false
		System.out.println(str1==str3); // false

		str1 = str1+"world"+str2;
		
	}

}
