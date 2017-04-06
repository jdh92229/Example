package com.dremingdean.javaee;

import java.util.Scanner;

public class NestingIfExample {
	int score;
	char grade;
	char opt;

	public void nestingIfStatement(){

		System.out.println("점수를 입력해 주세요");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);  // 입력받은 tmp의 문자열을 숫자로 변환

		if(score>90){
			grade = 'A';
			
			if(score>95){
				opt = '+';
			} else {
				opt = '-';
			}
			
		}else if(score>80){
			grade = 'B';
			
			if(score>85){
				opt = '+';
			} else {
				opt = '-';
			}
			
		}else if(score>70){
			grade = 'C';
			
			if(score>75){
				opt = '+';
			} else {
				opt = '-';
			}
		}else{
			grade = 'F';
		}

		System.out.printf("%c%c 입니다.", grade, opt);
	}

}

