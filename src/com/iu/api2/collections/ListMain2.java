package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.Scanner;


public class ListMain2 {

	public static void main(String[] args) {
		
		int [] arr= new int[3];
		ArrayList ar = new ArrayList();
		//다형성 
		//ar.add object에 상속
		//Integer num1 = new Integer(1); 과정 생략
		//Integer num1 = 1; 과정생략
		ar.add(1);							//Auto-Boxing (1)->()안의 1을 integer로 바뀌고 다형성 때문에 ar로 변형 
		ar.add(1.2);						
		ar.add('a');						
		ar.add(false);						
		ar.add("Hello");					
		ar.add(new Scanner(System.in));		
		
		int n1 = (Integer)ar.get(0);
		double n2 = (Double)ar.get(1); //double n2 = (double)ar.get(1); primitive타입으로 변형이 될때도 있음.. 안되면 reference타입으로 변형해주셈.
		
		
		for(int i =0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
	}

}
