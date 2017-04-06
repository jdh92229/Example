package com.dremingdean.javaee;

import java.util.Scanner;

public class SwitchExample {
	int score;
	char grade;

	public void switchStatement() {
		System.out.println("점수를 입력해 주세요(1~100)");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);  // 입력받은 tmp의 문자열을 숫자로 변환

		switch(score/10){
		case 10 :
		case 9 :
			grade = 'A';
			break;
		case 8 :
			grade = 'B';
			break;
		case 7 :
			grade = 'C';
			break;
		default :
			grade = 'F';
		}

		System.out.println(grade + " 입니다.");
	}
}
