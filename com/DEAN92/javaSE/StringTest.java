﻿package com.dremingdean.javase;

public class StringTest {
	public static void main(String[] args) {
//		==는 객체의 참조값 비교, Object 클래스의 equals()도 참조값비교
//		String 클래의 equals()는 오버라이딩 되어있음->문자열 내용비교				
		String aa = "aa";
		String bb = "aa";
		String cc = new String("aa");
		String dd= bb;
		System.out.println(aa.equals(bb));
		System.out.println(aa.equals(cc));
		System.out.println(aa==bb);
		System.out.println(bb==cc);
		System.out.println(aa==cc);
		System.out.println(dd==bb);
		System.out.println(dd.equals(cc));
	}
}
