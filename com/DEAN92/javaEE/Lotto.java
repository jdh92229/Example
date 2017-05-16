package com.dremingdean.javaee;

import java.util.Random;

public class Lotto {
	int[] lotto = new int[6];
	Random random = new Random();
	
	public void makeLotto(){
		lotto[0] = random.nextInt(45)+1;
		
//		break문을 사용했을 경우
//		for(int i=1; i<6; i++){
//			int temp = random.nextInt(45)+1;
//			lotto[i]=temp;
//			for(int j=0; j<i; j++){                                                          
//				if(lotto[j]==temp){
//					i--;
//					break;						
//				}				
//			}			
//		}	
		
//		continue문을 사용했을 경우
		for(int i=1; i<6; i++){
			int temp = random.nextInt(45)+1;
			for(int j=0; j<i; j++){
				if(lotto[j]==temp){
					temp = random.nextInt(45)+1;
//					continue문을 만나도 j값이 1 증가 하므로
//					j=0으로 하면 j가 1증가되어 j=1이 되어서 for문이
//					실행되므로 j=0일때는 비교가안됨
					j=-1;
					continue;					
				}
				lotto[i]=temp;
			}			
		}
		
			
		for(int value: lotto){
				System.out.print(" [ "+value+ " ] ");
					
		}
	}
	

}
