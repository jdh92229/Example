package com.dremingdean.javaee;

import java.util.Scanner;

public class NestingIfExample {
	int score;
	char grade;
	char opt;

	public void nestingIfStatement(){

		System.out.println("������ �Է��� �ּ���");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);  // �Է¹��� tmp�� ���ڿ��� ���ڷ� ��ȯ

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

		System.out.printf("%c%c �Դϴ�.", grade, opt);
	}

}

