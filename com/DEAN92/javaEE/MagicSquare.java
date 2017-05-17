package com.dremingdean.javaee;

public class MagicSquare{
	int[][] MagicSquare;
//	int degree =5;
	int degree;
	
	public MagicSquare() {
		// TODO Auto-generated constructor stub
	}

	public MagicSquare(int degree) {
		this();
		this.degree=degree;
		start();
	}

	public void start(){
		MagicSquare = new int[degree][degree];
		int x=0;
		int y=degree/2;
		MagicSquare[x][y]=1;
		
		for(int pos=2; pos<=degree*degree; pos++){
			x=x-1;	
			y=y-1;
			
			if(x<0){
				if(y>=0){
					x=x+degree;
				}else{
					x=x+2;
					y=y+1;
				}
			}else{
				if(y<0){
					y=y+degree;
				}else{
					if(MagicSquare[x][y]!=0){
						x=x+2;
						y=y+1;
					}
				}
			}
			MagicSquare[x][y]=pos;
		}

		for(int[] first:MagicSquare){
			for(int value:first){
				System.out.print(value+ " ");
			}
			System.out.println();
		}
	}

}
