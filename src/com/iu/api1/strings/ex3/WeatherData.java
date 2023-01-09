package com.iu.api1.strings.ex3;

import java.util.StringTokenizer;

public class WeatherData {
	
	private String data;
	
	public WeatherData() {
				// 지역 기온 날씨상태 미세먼지농도
		this.data="SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
	}
	
	public WeatherDTO[] init() {
		StringTokenizer st = new StringTokenizer(this.data,",");
		WeatherDTO[]wethers = new WeatherDTO[st.countTokens()/4];
		
		int i = 0;
	
		while(st.hasMoreElements()) {		
		WeatherDTO weatherDTO = new WeatherDTO();
		String t1 = st.nextToken();
		weatherDTO.setCity(t1);
		String t2 = st.nextToken();
		weatherDTO.setGion(Integer.parseInt(t2));
		String t3 = st.nextToken();
		weatherDTO.setStatus(t3);
		String t4 = st.nextToken();
		weatherDTO.setMise(Integer.parseInt(t4));
		
		wethers[i]=weatherDTO;
		i++;
		}
		return wethers;
		
	}
	//메서드명 init(초기화, 시작의 의미)
	//data를 파싱해서 각 Data를 DTO에 대입하고 (4개 대입되어야함 추가도 할 수 있어야함)
	//DTO들을 리턴
	//TEST : init를 호출하여 출력
	
//	public WeatherDTO[] init() {
//			
//		String [] datas = this.data.split(",");
//		
//		//split으로 나오는 데이터를 새로운 배열로 생성, 4개씩의 정보가 묶이는 배열.
//		WeatherDTO [] weathers = new WeatherDTO[datas.length/4];
//		
//		int idx =0; //1., 2.
//		for(int i=0; i<datas.length; i=i+4 /* 1.i=i+4 2.i++ */ ){
//			WeatherDTO weatherDTO = new WeatherDTO(); //생성자 선언..
//
//			//1. int idx 사용 i증감식 : i=i+4
//			weatherDTO.setCity(datas[i]);
//			
//			weatherDTO.setGion(Integer.parseInt(datas[i+1]));
//			weatherDTO.setStatus(datas[i+2]);
//			weatherDTO.setMise(Integer.parseInt(datas[i+3]));
////			
//			//2. int idx 사용 i증감식 : i++
////			weatherDTO.setCity(datas[i]);
////			weatherDTO.setGion(datas[++i]);
////			weatherDTO.setStatus(datas[++i]);
////			weatherDTO.setMise(datas[++i]);
//			
//			//3. idx 미사용 i증감식 : i++
////			weatherDTO.setCity(datas[i]);
////			weatherDTO.setGion(datas[++i]);
////			weatherDTO.setStatus(datas[++i]);
////			weatherDTO.setMise(datas[++i]);
////			weathers[i/4]=weatherDTO;
//			
//			//idx 사용
//			weathers[idx]=weatherDTO;
//			idx++;
//		}
//					
//		return weathers;
//		
//		
//			
//		
//	}
//
}
