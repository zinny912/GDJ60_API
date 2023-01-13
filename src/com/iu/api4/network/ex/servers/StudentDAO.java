package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class StudentDAO {
	
	//List의 내용들을 하나의 String으로 만들어주는 메서드
	public String makeList(ArrayList<StudentDTO> ar) {
			String result="";
	//필요한 정보를 받아와야함 -> 매개변수 ArrayList<StudentDTO> ar 설정
			StringBuffer sb = new StringBuffer();
			for(StudentDTO studentDTO:ar) {
				sb.append(studentDTO.getName());
				sb.append("-");
				sb.append(studentDTO.getNum());
				sb.append("-");
				sb.append(studentDTO.getKor());
				sb.append("-");
				sb.append(studentDTO.getMath());
				sb.append("-");
			}
			result = sb.toString();
			result = result.substring(0,result.length()-1);
						
			return result;
	}
	
	
	
	
	
	//초기화 메서드
	public ArrayList<StudentDTO> init() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		File file = new File("C:\\fileTest","1673587522936.txt");
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		
		//String s = br.readLine() != null
		boolean check = true;
		while(check) {
			String s = br.readLine();
			//null과 비교할때 equals쓰면 오류남
			if(s==null) {
				break;
			}
			StringTokenizer st = new StringTokenizer(s,"-");
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setName(st.nextToken()); //이름
			studentDTO.setNum(Integer.parseInt(st.nextToken()));
			studentDTO.setKor(Integer.parseInt(st.nextToken()));
			studentDTO.setEng(Integer.parseInt(st.nextToken()));
			studentDTO.setMath(Integer.parseInt(st.nextToken()));
			studentDTO.setTotal(studentDTO.getKor()+studentDTO.getEng()+studentDTO.getMath());
			studentDTO.setAvg(studentDTO.getTotal()/3.0);
			//잘려진 5개의 정보를 하나로 묶자 -> DTO
			// 여러명의 정보를 array에 저장 arrayList 생성
			ar.add(studentDTO);
		
		} //while 끝
		
		return ar;
		
	}
}
