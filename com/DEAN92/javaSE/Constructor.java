package com.dremingdean.javase;

public class Constructor {
	int value= 7;	

	public Constructor() {
		System.out.println("이것은 생성자입니다");
	}
	
	public void test(){		
		ReceiveClass rc = new ReceiveClass();
		rc.test(value);
		System.out.println(value);
		System.out.println("CallClass 에서 출력 " +rc.test1());
		Mabang mm = rc.test2();
		mm.num=9;
		mm.start();
		
		float result=rc.sum(6, 7.3f);
		int result1=rc.sum(3, 4);
		float result2=rc.sum(6.6f, 99);
		System.out.println(result+"  "+result1+"   "+ result2);
		
//		System.out.println(rc.staticTest());
		System.out.println(ReceiveClass.staticTest());
	}

}
