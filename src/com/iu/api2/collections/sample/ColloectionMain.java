package com.iu.api2.collections.sample;

import java.util.ArrayList;

public class ColloectionMain {

	public static void main(String[] args) {
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();
		
		//☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆		
		ArrayList<Parent> ar = new ArrayList<>();
		ar.add(child1);
		ar.add(child2);
		
		System.out.println(ar.get(0) instanceof Child2);
		//0번의 참조변수가 Child1타입입니까? -> 맞으면 true, 틀리면 flase
		//☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆☆
		
		
		
		
		ArrayList<? extends Parent> ar2 = new ArrayList<>();
		// < ? extends Parent> ar2가 Parent의 상속받는 하위 클래스들을 모으겠다
		ArrayList<? super Parent> ar3 = new ArrayList<>();
		// parent타입을 상속하는 부모 클래스를 모으겠다
		
		//Child1 ch1 = ar.get(0); //모든 parent라고 인식되므로 Child1 타입으로 변환해줘야함
		//Child1 ch1 = (Child1)ar.get(0);
		
		

	}

}
