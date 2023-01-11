package com.iu.api2.date;

import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public class UUIDMain {

	public static void main(String[] args) {
		String name = UUID.randomUUID().toString();
		System.out.println(name);

		Calendar calendar = Calendar.getInstance();
		name = calendar.getTimeInMillis()+"abc";
		
		//Random random 가짜 난수 -> 랜덤하게 뽑는것처럼 보이지만 나중으로 가면 일정한 패턴으로 출력됨
		//Random(long seed) -> seed를 만들때 시간으로 설정하면 무한한 랜덤 생성가능
		Random random = new Random(calendar.getTimeInMillis());
		
	}

}
