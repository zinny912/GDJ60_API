package com.iu.api3.io;

import java.io.File;

public class FileMain1 {

	public static void main(String[] args) {
		//1. java.io.File 클래스
		//	 HDD에 파일과 폴더의 정보를 담으려고하는 클래스
		File file = new File("C:\\");
		
		System.out.println(file.isDirectory());
		System.out.println(file.isFile());
		System.out.println(file.length());//파일의 크기(용량)
		System.out.println(file.exists());
		//file.mkdir();
		if(!file.exists()) {
			file.mkdirs(); //실제 폴더안에 없는폴더의 안에 없는폴더를 생성시킴
	}
		String[] files = file.list();
		for(String name: files) {
			System.out.println(name);
			//File f = new File("C:\\"+name);//절대경로
			File f = new File(file,name);//절대경로
			System.out.println(f.isDirectory());
		}
		
		File [] fs = file.listFiles();
		
		
		//file.delete();
	}
}
