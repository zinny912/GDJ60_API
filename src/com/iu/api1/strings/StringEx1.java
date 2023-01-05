package com.iu.api1.strings;

public class StringEx1 {

	public static void main(String[] args) {
		//
		
		String phone ="010-1234-5678";
		int num=0;		
		boolean check = true;
		
		while(check) {
			num = phone.indexOf('-',num);
			if(num!=-1) {
				System.out.println("IDX :"+num);
				num++;
			}else {
				break;
			}
		
		}
	}

}
