package com.iu.api2.collections.ex1;

import java.util.ArrayList;
import java.util.Scanner;


//Controller는 StudentDAO 가 필요하다 의존적이다 의존성 dependency 멤버변수로 써야함
public class StudentController {
	private Scanner sc;
	private StudentDAO studentDAO;
	private StudentView studentView;
	private ArrayList<StudentDTO> ar;
	
	
	public StudentController() {
		sc = new Scanner(System.in);
		studentDAO = new StudentDAO();//주입
		studentView = new StudentView();//의존성 주입(DI)
	}
	
	
	public void start() {
		
		boolean check = true;
		
		while(check) {
			System.out.println("1. 학생정보초기화");
			System.out.println("2. 학생정보전체조회");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 학생정보추가");
			System.out.println("5. 학생정보삭제");
			System.out.println("6. 프로그램종료");
			int select = sc.nextInt();
			
			switch(select) {
	
			case 1:
				ar=studentDAO.init();// ArrayList<StudentDTO> ar
				break;
			
			case 2:
				studentView.view(ar);
				break;
			
			case 3:
				StudentDTO studentDTO=studentDAO.findByName(ar);
				if(studentDTO != null) {
					System.out.println(studentDTO);
				}else {
					System.out.println("찾는 학생이 없다");
				}
				break;
				
			case 4:
				studentDAO.addStudent(ar);
				break;
				
			case 5:
				select=studentDAO.removeStudent(ar);
				if(select==1) {
					studentView.view("삭제 성공");
				}else {
					studentView.view("삭제 실패");
				}
				break;
				
				
			default:
				check=false;
				break;
			}
			
			
			
		}
		
		
	}

}
