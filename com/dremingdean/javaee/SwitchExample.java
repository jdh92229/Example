package com.dremingdean.javaee;

import java.util.Scanner;

public class SwitchExample {
	int score;
	char grade;

	public void switchStatement() {
		System.out.println("������ �Է��� �ּ���(1~100)");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);  // �Է¹��� tmp�� ���ڿ��� ���ڷ� ��ȯ

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

		System.out.println(grade + " �Դϴ�.");
	}
}
