package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherInput {
	private Scanner sc;
	
	public WeatherInput() {
		this.sc = new Scanner(System.in);
	}
	
	//도시 하나의 정보 검색
	//search 메서드명
	//weather배열
	//배열을 받고, 키보드로부터 검색할 도시명을 입력 받음
	//대소문자 무관
	//찾은 DTO리턴 , 없으면 null 리턴
	
	public WeatherDTO search(WeatherDTO[] datas) {
		System.out.print("찾으려는 도시명입력: ");
		String str = sc.next();
		
		weatherDTO.getCity()
		WeatherDTO newssss = null;
		for(int i=0;i<datas.length;i++) {
			if(ssss.equals(datas[i])){
				;
			}
		}
		return 
	}
	
	//add 메서드명
	//배열을 받고, 키보드로부터 정보들을 입력 받음
	// 도시명, 기온, 현재상태, 미세먼지 농도
	// 배열에 추가하고 배열을 리턴
	
	//접근지정자, 모르면 void, 메서드명 (정보들 배열을 받아서 )
	public WeatherDTO[] add(WeatherDTO[] weatherDTOs) { //생성된 배열은 배열길이 수정이 안되니 새로운 배열정보를 생성해야함
		WeatherDTO weatherDTO = new WeatherDTO();
		System.out.println("도시명을 입력하세요");
		weatherDTO.setCity(sc.next());
		System.out.println("기온을 입력하세요");
		weatherDTO.setGion(sc.next());
		System.out.println("날씨를 입력하세요");
		weatherDTO.setStatus(sc.next());
		System.out.println("미세먼지를 입력하세요");
		weatherDTO.setMise(sc.next());
		//하나의 도시정보 완성
		WeatherDTO[] newInfo = new WeatherDTO[weatherDTOs.length+1]; // 새로운 배열 생성
		
		//새로운 배열에 정보 옮겨주기, 짧은 배열 기준으로 범위지정
		for(int i=0; i<weatherDTOs.length;i++) {
			newInfo[i]=weatherDTOs[i];
		}
		newInfo[weatherDTOs.length]=weatherDTO;
		
		return newInfo;
		
	}
	
	

	//remove 메서드명
	//배열을 받고, 키보드로부터 삭제할 도시명을 입력 받음
	//배열에서 삭제하고 배열을 리턴
	
	public WeatherDTO[] remove(WeatherDTO[] weatherDTOs) {
		WeatherDTO[] newInfo = new WeatherDTO[weatherDTOs.length-1]; // 새로운 배열 생성
		WeatherDTO weatherDTO = new WeatherDTO();
		
		System.out.println("도시명을 입력하세요");
		String name = sc.next().toUpperCase();
	
		
		//새로운 배열에 정보 옮겨주기, 긴 배열 기준으로 범위지정 (삭제)
		for(int i=0; i<weatherDTOs.length;i++) {
			if(name.equals(weatherDTOs[i].getCity().toUpperCase()))
					{
			
			newInfo[i]=weatherDTOs[i];
		}
		newInfo[weatherDTOs.length]=weatherDTO;
		
		return newInfo;
		return
	}
	
}
