package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain {

	public static void main(String[] args) {
		//순서유지, 값의 중복 허용, 배열기반
		int [] arr = new int[3];
		ArrayList ar = new ArrayList();
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		//배열은 주어진 배열칸수만큼만 데이터 추가가능하지만,
		//ArrayList는 계속해서 데이터 추가가 가능함
		ar.add(1);
		ar.add(2);
		ar.add(3);
		ar.add(4);
		
		for(int i=0; i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println("-------------------------------------");
		
		ar.add(1,8);
		//1번 인덱스에 8을 집어넣어라 => 1번인덱스가 인덱스2번으로 밀리면서 뒤의 데이터도 인덱스번호 1씩 추가됨
		ar.remove(0);
		//0번 인덱스를 지우세여~~~~~~
		ar.set(2, 9);
		//2번 인덱스의 값을 9로 수정해주세여~~~~~~~
		//ar.clear();
		//ar에 저장된 데이터값을 다 지워주세여~~~~~~~~~
		
		// .size() 몇칸인지 인증받는 메서드 = length()랑 비슷
		for(int i=0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
			// 데이터 추가는 add, 데이터 추출은 get
		}
		
	}

}
