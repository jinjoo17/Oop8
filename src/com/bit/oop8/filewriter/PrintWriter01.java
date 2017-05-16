package com.bit.oop8.filewriter;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriter01 {

	private static int i;

	public static void main(String[] args) {
		
		
		String fileName="src/com/bit/oop8/filewriter/grade.txt";
		PrintWriter pw =null;
		//파일을 기록하기위해 open
		try {
			
			//쓰기금지가 되어 있는경우 예외가 발생 할 수 있다.
			PrintWriter pw1 = new PrintWriter(fileName);
			for(int i=0; i<100;i++);{
			      pw1.print(i+1);
			int grade = (int)(Math.random()*(100-50)+50);
			pw1.print(":");
			pw1.println(grade);//마지막은 항상 println
			
		}
		pw1.close();//파일을 기록하기 위해open하면 반드시 닫아줘야함 
			
		} catch (FileNotFoundException e) {
			System.out.println("파일을 쓰기로 열수 없습니다.");
			
			//만약 예외가 발생했을때,파일을 닫지않고 app이 종료되면
			//그 파일은 문제가 될수 있다.
			//OS에서도 파일을 열기, 삭제가 안될수 있다.
			pw.close();
			//e.printStackTrace();
		}
		System.out.println("성적표 기록이 모두 끝났습니다");
	}

}
