package com.iu.api2.collections;

import java.util.ArrayList;

public class ListMain3 {

	public static void main(String[] args) {
		//Collection은 Type에 안전하지 않다
		//Generic : 타입의 안정성을 위한것
		//E : 변수명
		//E = Integer
		ArrayList<Integer> ar=new ArrayList<>();
		ar.add(1);
		int num = ar.get(0);
		
		
		ArrayList<WeatherDTO> ar2 = new ArrayList<>();
		WeatherDTO weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Seoul");
		ar2.add(weatherDTO);
		weatherDTO = new WeatherDTO();
		weatherDTO.setCity("Jeju");
		ar2.add(weatherDTO);
		
//		weatherDTO = new WeatherDTO();
//		weatherDTO.setCity("Jeju");
		
		ar2.remove(weatherDTO);
		
		for(int i=0; i<ar2.size();i++) {
			
			System.out.println(ar2.get(i).getCity());
		}
		
	}

}
