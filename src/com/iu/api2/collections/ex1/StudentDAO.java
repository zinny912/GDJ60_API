package com.iu.api2.collections.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO {
	
	private StringBuffer sb;
	private Scanner sc;
	
	public StudentDAO() {
		this.sc=new Scanner(System.in);
		this.sb=new StringBuffer();
		
		sb.append("iu-1-90-60-70-");
		sb.append("winter-2-86-84-75-");
		sb.append("suji, 3, 89, 74, 87 ");
		sb.append("choa, 4, 71, 25, 99 ");
		
	}
	
	//학생정보백업
	//현재시간을 밀리세컨즈로 파일명으로 해서 백업할때마다 파일작성
	public void backupStudent() {
		Calendar ca = new GregorianCalendar();
		int ms = ca.get(Calendar.MILLISECOND);
		
		File file = new File("C:\\fileTest","ms");
		
		try {
			FileWriter fw = new FileWriter(file,true);
			fw.write();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	//학생정보삭제
	public int removeStudent(ArrayList<StudentDTO> ar) {
		//삭제확인용 변수
		//0이면 삭제 실패, 1이면 삭제 성공
		int result = 0;
		
		System.out.println("삭제할 이름 입력");
		String name = sc.next();
		//ar.remove(index) : 인덱스번호 필요. 향상된 for사용x
		//ar.remove(Object): 타입을 Object타입으로 변경하면 향상된for사용O
		
		//1. 인덱스번호로 지우기
//		for(int i=0; i<ar.size();i++) {
//			
//			if(name.equals(ar.get(i).getName())) {
//				ar.remove(i);
//				result = 1;
//				break;
//			}
//		}
		//2. 향상된for
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				ar.remove(studentDTO);
				result=1;
				break;
			}
			
		}
		return result;
		
		
		
		
		
	}
	
	
	//학생정보추가
	public void addStudent(ArrayList<StudentDTO> ar) {
		//기존의 학생정보 받아와야함 ArrayList<StudentDTO> ar 매개변수
		StudentDTO studentDTO = new StudentDTO();
		System.out.println("이름을 입력: ");
		studentDTO.setName(sc.next());
		System.out.println("번호를 입력: ");
		studentDTO.setNum(sc.nextInt());
		System.out.println("국어점수 입력");
		studentDTO.setKor(sc.nextInt());
		System.out.println("영어점수 입력");
		studentDTO.setEng(sc.nextInt());
		System.out.println("수학점수 입력");
		studentDTO.setMath(sc.nextInt());
		studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
		studentDTO.setAvg(studentDTO.getTotal()/3.0);
		
		ar.add(studentDTO);
		
		
//		String name = sc.next();
//		studentDTO.setName(name);
		
	}
	
	
	
	
	
	
	//학생정보검색
	//어디선가 학생정보를 받아와야함 -> studentDTO:학생한명의 정보 -> arrayList<StudentDTO> ar 학생전체정보
	public StudentDTO findByName(ArrayList<StudentDTO> ar) {
		System.out.println("검색할 이름을 입력:");
		String name = sc.next();
		
		StudentDTO st = null; //찾지못하면 null
		
		// ar 에서 studentDTO정보를 꺼냄
		for(StudentDTO studentDTO:ar) {
			if(name.equals(studentDTO.getName())) {
				//return을 통해서 필요로 하는 곳으로 보내줌 -> StudentDTO
				st = studentDTO; //객체를 가리키는 주소(studentDTO)를 보냄
				break;
			}
		}
		
		return st;
	}
	
	
	
	//StudentDAO(){}메서드에 있는 정보를 StudentDTO클래스에 입력하기위햄
	//학생정보초기화
	public ArrayList<StudentDTO> init() {
		//sb를 String 타입으로 변경 toString();
		String data = this.sb.toString();
		//1." "를 "-"로변경
		data=data.replace(" ", "-");
		//2.","제거
		data=data.replace(",", "");
		
		//System.out.println(data); //코드를 실행해서 정상작동하는지 확인
		//tokenizer를 사용하기위해 객체생성, import되어야함
		StringTokenizer st = new StringTokenizer(data,"-");
		ArrayList<StudentDTO> ar = new ArrayList<>();
		while(st.hasMoreTokens()) {
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken());
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			//while문이 종료되면 사라지는 데이터가 되기때문에, 어딘가에 정보를 저장해주어야함-------------> ArrayList 
			ar.add(studentDTO); //만든 데이터를 array리스트에 저장
		}
		
		return ar;
		
	}

}


