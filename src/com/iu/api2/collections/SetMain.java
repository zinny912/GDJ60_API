package com.iu.api2.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetMain {

	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(1);
		hs.add(11);
		hs.add(11);
		hs.add(2);
		hs.remove(1); // 인덱스번호를 지우는게 아니고 해당하는 숫자를 삭제
		
		System.out.println(hs.toString());
		System.out.println(hs.size());
		
		//Iterator 반복형 - 또하나의 collection 
		//List, Set과 같이 collection타입의 하나 
		//set에 들어가있는 데이터를 하나씩 꺼내기 위해서 iterator 사용, 열거
		
		//Set의 Data들을 Iterator 형식으로 변경
		//변수선언
		Iterator<Integer> is = hs.iterator();
		//다형성 개념
		
		while(is.hasNext()) {
			Integer num = is.next();
			System.out.println(num);
			
		}
	}

}
