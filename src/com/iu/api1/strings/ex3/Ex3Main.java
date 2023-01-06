package com.iu.api1.strings.ex3;

public class Ex3Main {

	public static void main(String[] args) {
		System.out.println("Start");
		
//		WeatherController weathercontroller = new WeatherController();
//		weathercontroller.start();

		new WeatherController().start();
		//start가 종료되면 다시 쓸 수 없음 . 한번만 쓰고 끝나는 애들은 이렇게 써도 된다
		
		
		
//		WeatherData weatherData = new WeatherData();
//		WeatherDTO [] datas = weatherData.init();
//		
//		
//		
//		for(int i=0; i<datas.length;i++) {
//			System.out.println(datas[i].getCity());
//			System.out.println(datas[i].getStatus());
//			System.out.println(datas[i].getGion());
//			System.out.println(datas[i].getMise());
//		}
//			
//		
//		
//		
//		
//		
		System.out.println("Finish");

	}

}
