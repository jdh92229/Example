package com.dremingdean.javaee;

import java.util.Scanner;

public class IfExample {
	int score;

	public void ifStatement(){

		System.out.println("������ �Է��� �ּ���");

		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();  // ȭ���� ���� �Է¹��� ������ tmp�� ����
		score = Integer.parseInt(tmp);  // �Է¹��� tmp�� ���ڿ��� ���ڷ� ��ȯ

		if(score>90){
			System.out.println("A �Դϴ�.");
		}else if(score>80){
			System.out.println("B �Դϴ�.");
		}else if(score>70){
			System.out.println("C �Դϴ�.");
		}else{
			System.out.println("F �Դϴ�.");
		}
	}

}

