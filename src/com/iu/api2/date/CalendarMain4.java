package com.iu.api2.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarMain4 {

	public static void main(String[] args) {
		Calendar ca = Calendar.getInstance();
		//2023년 1월 11일 => format 
		SimpleDateFormat sd = new SimpleDateFormat("yyyy년 MM월 dd일 E");
		//(yyyy-MM-dd-E)패턴형식 보면서 활용
		sd.applyPattern("yyyy-MM-dd-E");
		String p = sd.format(ca.getTime());
		
		System.out.println(p);
		
		
		
		
		
	}

}
