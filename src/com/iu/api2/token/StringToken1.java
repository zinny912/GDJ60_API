package com.iu.api2.token;

import java.util.StringTokenizer;

public class StringToken1 {

	public static void main(String[] args) {
		String nations = "Korea,서울,USA,워싱턴,UK,런던,Japan,도쿄";
		String [] n = nations.split(",");
		
		for(int i=0; i<n.length; i++) {
			NationDTO nationDTO = new NationDTO();
			nationDTO.setName(n[i]);
			nationDTO.setCity(n[++i]);
		}
		
		StringTokenizer st = new StringTokenizer(nations,",");
		
		
		//hasMoreTokens 끝까지 가서 더이상 token이 없으면 false, 있으면 true
		while(st.hasMoreTokens()) {
			NationDTO nationDTO = new NationDTO();
			String t1 = st.nextToken();
			nationDTO.setName(t1);
			System.out.println(t1);
			
			String t2 = st.nextToken();
			nationDTO.setCity(t2);
			System.out.println(t2);
		}
		

	}

}
