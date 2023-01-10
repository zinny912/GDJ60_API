package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	
	public StudentDAO() {
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
			
	}
	
	public StudentDAO[] init() {
		
		String str = this.sb.toString();
		StringTokenizer st = new StringTokenizer(str,", -");
		
		StudentDAO[] studentDAOs=new StudentDAO[st.countTokens()/5];
		int i=0;
		
		while(st.hasMoreTokens()) {
			StudentDAO studentDAO= new StudentDAO();
			studentDAOs[i]=studentDAO;
			i++;
		}
		return studentDAOs;
	
		
	public void add() {
		ArrayList ar = new ArrayList();
		
	}
		
	
	public void remove() {
		
		
	}
	}

}
