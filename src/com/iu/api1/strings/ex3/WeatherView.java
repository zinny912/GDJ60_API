package com.iu.api1.strings.ex3;

public class WeatherView {
	
	//메서드 2개 생성
	
	//1. 모든 날씨 정보를 출력
	public void total(WeatherDTO[] datas) {
		for(int i=0;i<datas.length;i++) {
			this.view(datas[i]);
		}
	}
	
	
	//2. DTO 하나의 정보를 출력
	public void view(WeatherDTO weatherDTO) {
		System.out.println("-------------------------");
		System.out.println("City: "+weatherDTO.getCity());
		System.out.println("Gion: "+weatherDTO.getGion());
		System.out.println("Status: "+weatherDTO.getStatus());
		System.out.println("Mise: "+weatherDTO.getMise());
		
	}

}
