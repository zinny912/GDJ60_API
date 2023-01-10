package com.iu.api2.collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapMain {

	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		//Key로 사용할 데이터타입, 모으고 싶은 정보들
		//보통 Key로 String 많이 씀
		
		//데이터추가
		map.put("k1","v1");
		map.put("k2","v2");
		map.put("k3","v3");
		map.put("k4","v2Re");
		
		//데이터조회
		
		String v = map.get("k3");
		
		//삭제
		v=map.remove("k2");
		
		//전체삭제
		boolean check = map.containsKey("v7");
		System.out.println(check);
	
		//반복
		//1.Key들의 정보를 알아야 함
		//	Key들을 Set으로 변환
		//	Set을 Iterator로 변환하여 반복형으로
		Iterator<String> it = map.keySet().iterator(); // -> iterator로 변환하여 열거형
		
		//hasNext() 다음거를 가지고옴 있으면 true, 없으면 false
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("Key : "+key);
			String value = map.get(key);
			System.out.println("Value : "+value);
		}
		
		
		map.clear();
		
		System.out.println(v);
		System.out.println(map);
	}

}
