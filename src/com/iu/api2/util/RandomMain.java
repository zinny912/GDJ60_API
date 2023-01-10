package com.iu.api2.util;

import java.util.ArrayList;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();
		
		//1000원 로또 구매 1-45 
			
		boolean check = true;
		while(check) {
		
		int num1=random.nextInt(45)+1;
		
		for(int i=0;i<6;i++) {
			num1=ar.get(i);
			if(num1==ar.get(i)) {
				
			}
		
		
	}

}

}		
//		for(int i=0; i<6; i++) {
//			int arr = ar.get(i);
//			if(num1==arr) {
//			continue;
//			}
//		}
//		System.out.println(num1);
//		System.out.println(ar.get(0));
//		
		
//		for(int i=1;i<7;i++) {	
//		
//		int num = ar.get(i); 
//		System.out.println(num);
//		}
		
			
	

