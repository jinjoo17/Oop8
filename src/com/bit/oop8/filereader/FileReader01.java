package com.bit.oop8.filereader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReader01 {

	public static void main(String[] args) {
		//읽기위한 파일 설정
		String fileName ="src/com/bit/oop8/filereader/data.txt";
		//파일을 읽기위해 열기 준비
		try {
			FileReader fileReader=new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(fileReader);
			//파일을 읽기 위한 임시저장소
			String reader= new String();//객채선언 reader저장소 주소저장/반드시 이렇게 선언해줘야함
			while (reader !=null) {
				try {
					reader=buffer.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}//한줄한줄 다읽어서 reader라는 카트에 담아라
				if(reader !=null){
					System.out.println(reader);
					
				}
				
			}
			
			
			String reader1;//변수에 들어가는 초기값이 null세팅,값을담을 변수
			String reader2="";//null세팅,값
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
