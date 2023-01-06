package com.iu.api1.strings.ex3;

public class ExMainnnnnnnn {

	public static void main(String[] args) {
		String data="SEOUL,12,맑음,60,Daegu,68,비,10,"
				+ "Jeju,-56,눈,12,junju,32,흐림,5";
				
		String [] d1 = data.split(",");
		
		for(int i=0; i<d1.length;i++) {
			System.out.println(d1[i]);
				
		}
		
	
		

		}

	}

