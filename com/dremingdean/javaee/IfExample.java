package com.dremingdean.javaee;

import java.util.Scanner;

public class IfExample {
	int score;

	public void ifStatement(){

		System.out.println("점수를 입력해 주세요");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // 화면을 통해 입력받은 내용을 tmp에 저장
		score = Integer.parseInt(tmp);  // 입력받은 tmp의 문자열을 숫자로 변환

		if(score>90){
			System.out.println("A 입니다.");
		}else if(score>80){
			System.out.println("B 입니다.");
		}else if(score>70){
			System.out.println("C 입니다.");
		}else{
			System.out.println("F 입니다.");
		}
	}

}

