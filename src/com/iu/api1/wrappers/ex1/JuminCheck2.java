package com.iu.api1.wrappers.ex1;

public class JuminCheck2 {
	
	//check
	//주민번호를 받아서(매개변수로 받아서)
	//-1 23 456 7(체크용번호)
	//991224-1234567
	//맨끝자리는 체크용 번호로 뺌
	// 9 	8	 0	 7	 2	 4 - 1	2 	3	4	5	6 
	// 2	3	 4	 5	 6	 7   8	9 	2 	3 	4 	5 각자리수 마다 곱하기
	//18	24 	 0	 35 12 	28 	 8 18 	6 	12 	20  30 다 더해서
	// 합을 11로 나누어서 나머지를 구함
	// ex) 122/11 = 몫 : 11, 나머지는 1
	// 나머지값을 11로 뺀 결과 값하고 체크용 번호랑 같은지 확인
	// 나머지가 1인경우 11-1 = 10
	// 11로 뺀 결과값이 두자리라면, 11로 뺀 결과값을 다시 10으로 나눈 나머지를 체크용 번호랑 같은지 확인
	// 10/10 몫 : 1, 나머지 : 0 => 0과 체크용 번호가 같은지 확인
	// "정상" or "잘못된거"
	
	public void check(String jumin) {
		//991224-1234567
		//jumin.charAt()
		//jumin.substring()
		
		int num=2;
		int sum = 0;
		for(int i=0;i<jumin.length()-1; i++) {
			if(i==6) {
				continue;
			}
			
			//charAt()을 쓰는 경우
			//sum = sum +Integer.parseInt(jumin.charAt(i)+"")*(num);
			//sum = sum +Integer.parseInt(Stirng.valueOf(jumin.charAt(i))*(num);
			//valueOf()가 static 메서드

			sum = sum +Integer.parseInt(jumin.substring(i,i+1))*num;
			num++;
			
			if(num==10) {
				num=2;
			}
		}
		System.out.println(sum);
		int result =11-sum%11;
		if(result>9) {
			result=result%10;
		}
		int flag = Integer.parseInt(jumin.substring(13,14));
		if(result==flag) {
			
			System.out.println("정상");
		}else {
			System.out.println("비정상");
		}
	
		
//		int idx=2;
//		for(int i=0; i<14;i++) {
//			String str = jumin.replace("-","");
//			str = str.substring(i,i+1);
//			int a = Integer.parseInt(str);
//			int aa = idx*a;
//			if(idx>8) {
//				idx=1;
//			}
//			idx++;
//		System.out.println(aa);
//		}
//		for(int i=0; i<13;i++) {
//			
//			
//					
//					
//					
//					
//					
//		}
//		
		
		
		
	}

}
