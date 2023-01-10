package com.iu.api2.collections.ex1;

import java.util.ArrayList;

public class Ex1Main {

	public static void main(String[] args) {
		//학생은 이름 번호 국어 영어 수학 총점 평균으로 이루어짐
		//1. 학생정보초기화
		//2. 학생정보전체조회
		//3. 학생정보검색조회(이름검색)
		//4. 학생정보추가
		//5. 학생정보삭제(이름)
		//6. 프로그램종료

		
		
		new StudentController().start();
		
//		StudentDAO dao = new StudentDAO();
//		ArrayList<StudentDTO> ar =dao.init();
//
//		dao.addStudent(ar);
//		for(int i=0;i<ar.size();i++) {
//		System.out.println(ar.get(i).getName());
//		}
		
		
		
		
		
		
//		for(int i=0;i<ar.size();i++) {
//			System.out.println(ar.get(i).getName());
		
		//향상된 for문
//		for(StudentDTO studentDTO:ar) {
//			//ar의 길이만큼 알아서 진행 
//			//studentDTO의 값을 
//		}
//		int [] nums = new int [3];
//		for(int n:nums) {
//			
//		}

	}

}
