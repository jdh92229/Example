package com.dremingdean.javase;

public class Array {
	int[] human= {1,3,5,7,9};
//	int[] human= new int[3];
	int[][] human1= new int[5][5];	
	int[][] diff = new int[3][];	
	int value=1;
	
//	2차원 배열의 크기가 다를때는 아래와 같이 선언해야 함
	public void diffArray(){
		diff[0] = new int[2];
		diff[1] = new int[4];
		diff[2] = new int[3];
	}
	
	public void test(){
		for(int i=0; i<human.length;i++){
			System.out.println(human[i]);
		}	
		
		System.out.println("");
		
		for(int i : human){
			System.out.println(i);
		}
		
		System.out.println("");
	}
	
	
	public void test1(){
		for(int i=0;i<human1.length;i++){
			for(int j=0;j<human1[i].length;j++){
				human1[i][j]=value;
				value++;
			}
		}
		
		System.out.println("향상된 for문사용");
		for(int[] first:human1){
			for(int value:first){
				System.out.print(value+ " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<human1.length;i++){
			for(int j=0;j<human1[i].length;j++){
				System.out.print(human1[i][j]+"  ");				
			}
			System.out.println();
		}
	}
}
