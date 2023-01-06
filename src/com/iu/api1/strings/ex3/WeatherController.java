package com.iu.api1.strings.ex3;

import java.util.Scanner;

public class WeatherController {
	
	//start 
	//1. 날씨정보초기화 init() 호출
	//"초기화가 완료되었습니다"
	//2. 전국날씨정보
	//배열에 있는 모든 정보를 출력 view 호출
	//3. 지역날씨검색
	//	도시정보가 없습니다. / 있으면 날씨정보 찍어주고,
	// 대소문자 무관하게
	//4. 지역날씨추가
	//	-> input
	//5. 지역날씨삭제
	// 배열에서 삭제하기
	//6. 종료	
	private Scanner sc;
	private WeatherData weatherData;
	private WeatherView weatherView;
	private WeatherInput weatherInput; 
	private WeatherDTO [] weatherDTOs = null;
	
		public WeatherController() {
		this.sc = new Scanner(System.in);
		this.weatherData = new WeatherData();
		weatherView = new WeatherView();
		weatherInput = new WeatherInput();
	}
	
	public void start() {
//		Scanner sc = new Scanner(System.in);
//		WeatherData weatherData = new WeatherData();
//		WeatherView weatherView = new WeatherView();
//		WeatherInput weatherInput = new WeatherInput(); 
//		WeatherDTO [] weatherDTOs = null;
		
		boolean check = true;
		while(check){
			System.out.println("1.날씨정보초기화");
			System.out.println("2.전국날씨정보");
			System.out.println("3.지역날씨검색");
			System.out.println("4.지역날씨추가");
			System.out.println("5.지역날씨삭제");
			System.out.println("6.종료");
			int select = sc.nextInt();
	
		switch(select) {
		case 1:
			weatherDTOs = weatherData.init();
			System.out.println("초기화 완료");
			break;
		case 2:
			weatherView.total(weatherDTOs);
			break;
		case 3:
			break;
		case 4:
			this.weatherDTOs = weatherInput.add(this.weatherDTOs); //(this.weatherDTOs)의 this는 생략가능
			break;
		case 5:
			this.weatherDTOs = weatherInput.remove(weatherDTOs);
			break;
			 
		default:
			System.out.println("프로그램 종료");
			check=!check;
			
				
			}
			
		}
		
		
		
		
		
		
	}
	
	
	

	
	
	
	}
	
	
	


