package com.dremingdean.javaee;

public class MethodInvocation {

	public static void main(String[] args) {
		ArithmeticOperation ao = new ArithmeticOperation();
		int addResult = ao.add(3, 7);
		int subtractResult = ao.subtract(10, 7);
		int multiplyResult = ao.multiply(2, 5);
		int divideResult = ao.divide(10, 2);
		
		System.out.println("add(3, 7) 결과 : " + addResult);
		System.out.println("subtract(10, 7) 결과 : " + subtractResult);
		System.out.println("multiply(2, 5) 결과 : " + multiplyResult);
		System.out.println("divide(10, 2) 결과 : " + divideResult);
	}

	static class ArithmeticOperation {
		int add(int a, int b) {
			int result = a + b;
			return result;
		}
		
		int subtract(int a, int b) {
			return a - b;     //add메소드 두 줄의 코드를 줄일 수 있다.
		}
		
		int multiply(int a, int b) {
			return a * b;
		}
		
		int divide(int a, int b) {
			return a / b;
		}
	}
}



