package com.pknu.test;

import java.util.Random;
import java.util.TreeSet;

public class TreeSetLotto {

	public static void main(String[] args) {
		Random rd = new Random(); 
		TreeSet<Integer> ts= new TreeSet<>();
		while(ts.size()<6){
			ts.add(rd.nextInt(45)+1);			
		}
		
		System.out.println(ts);

	}

}
