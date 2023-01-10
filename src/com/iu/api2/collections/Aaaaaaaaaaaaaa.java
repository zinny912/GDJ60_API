package com.iu.api2.collections;

import java.util.ArrayList;
import java.util.StringTokenizer;

import com.iu.api2.collections.ex1.StudentDAO;

public class Aaaaaaaaaaaaaa {

	public static void main(String[] args) {
		 
		
		StringBuffer sb=new StringBuffer();
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
		System.out.println(sb);
		String str = sb.toString();
		System.out.println(str);
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println(st);
		
		StudentDAO[] studentDAOs=new StudentDAO[st.countTokens()];
		int i=0;
		
		while(st.hasMoreTokens()) {
			StudentDAO studentDAO= new StudentDAO();
			studentDAOs[i]=studentDAO;
		
			i++;
		}	
		
		System.out.println(studentDAOs);
	}

}
