package com.iu.api2.collections.ex1;

import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentController {
	private Scanner sc;
	private StudentDAO [] studentDAOs;
	private StudentView studentView;
	private StudentDAO studentDAO;
	
	
	public StudentController() {
		this.sc = new Scanner(System.in);
		studentView = new StudentView();
		
	}
	
	public void start() {
		boolean check = true;
		
		while(check) {
			System.out.println("1.학생정보초기화");
			System.out.println("2.학생정보전체조회");
			System.out.println("3.학생정보검색조회");
			System.out.println("4.학생정보추가");
			System.out.println("5.학생정보삭제");
			System.out.println("6.프로그램종료");
			int select = sc.nextInt();
		switch(select) {
		case 1:
			studentDAOs=studentDAO.init();
			System.out.println("학생정보 초기화 완료");
			break;
		case 2:
			System.out.print("학생이름검색: ");
			
			
			break;
		case 3:
			System.out.print("학생이름검색: ");
			
			break;
		case 4:
			System.out.println("");
			
			break;
		case 5:
			System.out.println("삭제할 학생이름: ");
			
			break;
		default:
			System.out.println("프로그램종료");
			check=false;			
		
		}
			
			
		}
		
	}
	
	
		
		
	}

