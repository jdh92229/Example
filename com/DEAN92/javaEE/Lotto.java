package com.dremingdean.javaee;

import java.util.Random;

public class Lotto {
	int[] lotto = new int[6];
	Random random = new Random();
	
	public void makeLotto(){
		lotto[0] = random.nextInt(45)+1;
		
//		break���� ������� ���
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
		
//		continue���� ������� ���
		for(int i=1; i<6; i++){
			int temp = random.nextInt(45)+1;
			for(int j=0; j<i; j++){
				if(lotto[j]==temp){
					temp = random.nextInt(45)+1;
//					continue���� ������ j���� 1 ���� �ϹǷ�
//					j=0���� �ϸ� j�� 1�����Ǿ� j=1�� �Ǿ for����
//					����ǹǷ� j=0�϶��� �񱳰��ȵ�
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
