package com.iu.api2.date;

import java.util.Calendar;

public class CalendarMain2 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		Calendar birth = Calendar.getInstance();
		Calendar sample = Calendar.getInstance();
		
		birth.set(1991, 8, 12);;
		sample.set(Calendar.MINUTE, sample.get(Calendar.MINUTE)+1);
		
		//현재시간을 1/1000초 단위 밀리세컨즈 로 변환
		long n = now.getTimeInMillis();
		long s = sample.getTimeInMillis();
		
//		n = s-n;
//		n= n/(1000*60*60*24);
		
		long b = birth.getTimeInMillis();
		b=n-b;
		b=b/(1000*60*60*24);
		b=b/365;
		
		System.out.println("n : "+n);
		System.out.println("s : "+s);
		
		System.out.println("b : "+b);
		System.out.println(now.getTime());
		System.out.println(sample.getTime());
		System.out.println(birth.getTime());
		
	}

}
