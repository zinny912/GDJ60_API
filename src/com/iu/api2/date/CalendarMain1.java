package com.iu.api2.date;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarMain1 {

	public static void main(String[] args) {
		//Calendar class는 추상클래스라서 상속받아서 쓸 수 없음
		//GregorianCalendar
			Calendar ca = new GregorianCalendar();
			//현재날짜와 시간으로 객체가 만들어짐
			ca=Calendar.getInstance();
			System.out.println(ca);
			
			ca.set(Calendar.YEAR, 2032);
			ca.set(Calendar.MONTH, 11);
			
			
			
		//year
			int year = ca.get(Calendar.YEAR);
		//월은 0부터 시작
			int month = ca.get(Calendar.MONTH);
			
		//일
			int date = ca.get(Calendar.DATE);
			
			int day = ca.get(Calendar.DAY_OF_WEEK);//1:일요일
			
		//시 분 초
			int hours = ca.get(Calendar.HOUR);
			int minute = ca.get(Calendar.MINUTE);
			int sec = ca.get(Calendar.SECOND);
			
			System.out.println("Year :"+year);
			System.out.println("Month :"+(month+1));
			System.out.println("Date :"+date);
			System.out.println("Day : "+day);
			
			System.out.println("Hour : "+hours);
			System.out.println("Minute : "+minute);
			System.out.println("Sec : "+sec);
			
	}

}
