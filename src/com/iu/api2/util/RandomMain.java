package com.iu.api2.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		Random random = new Random();
		
		//1000원 로또 구매 1-45 
		
		//3. set 이용
		
		HashSet<Integer> hs = new HashSet<>();
		
		while(hs.size()<6) {
			hs.add(random.nextInt(45)+1);
		}
		
		System.out.println(hs);
		
		
		
		//1.배열
		int[]nums = new int[6];
		for(int i=0;i<nums.length;i++) {
			nums[i] = random.nextInt(45)+1;
			//비교하는 횟수설정 
			for(int j=0; j<i;j++) {
				if(nums[i]==nums[j]) {
					i--;
					break; //만나는 for문만 벗어남
				}
			}	
		}
		
		for(int i=0;i<nums.length;i++) {
			
			System.out.println(nums[i]);
			
		
		}
		System.out.println("======================");
		
		//2.ArrayList
		
		ArrayList<Integer> ar = new ArrayList<>();
		//6칸 채우면 false로 종료
		while(ar.size()<6) {
			int n = random.nextInt(45)+1;
			boolean check = true;
			for(int i=0;i<ar.size();i++) {
				if(n==ar.get(i)) {
					check=false;
					break;
				}
			}
			if(check) {
				ar.add(n);
				}
		}
			for(int i=0;i<ar.size();i++) {
				System.out.println(ar.get(i));
			}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
//		boolean check = true;
//		while(check) {
//		int num=random.nextInt(45)+1;
//		System.out.println(num);
//		ar.add(num);
//
//				
//		if(ar.size()>5) {
//			break;
//		}
//		
//	
//		}

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
		
			
	

