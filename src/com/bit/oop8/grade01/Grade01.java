package com.bit.oop8.grade01;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Grade01 {

	public static void main(String[] args) {
		String fileName ="src/com/bit/oop8/grade01/grade2.txt";
		Scanner scanner = new Scanner(System.in);
		PrintWriter pw =null;
		
		try {
			pw=new PrintWriter(fileName);
			int intNum=0;
			
			while(true){
				System.out.println(++intNum+"의 국어 점수는");
				String keyGrade=scanner.nextLine();
				if(keyGrade.equals("--0")) break;
				System.out.println(intNum+"의 영어 점수는");
				String keyGrade1=scanner.nextLine();
				System.out.println(intNum+"의 수학 점수는");
				String keyGrade2=scanner.nextLine();
				
				
				
			try{
				int intGrade=Integer.valueOf(keyGrade);
				int intGrade1=Integer.valueOf(keyGrade1);
				int intGrade2=Integer.valueOf(keyGrade2);
				
				pw.print(intNum);
				pw.print(":");
				pw.print(intGrade);
				pw.print(":");
				pw.print(intGrade1);
				pw.print(":");
				pw.println(intGrade2);
				
				
				
				
			}catch(NumberFormatException e){
				System.out.println("점수가 잘못되었습니다.");
				System.out.println(intNum+"의 점수를 다시 입력하세요");
			}
			pw.close();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
