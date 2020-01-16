package com.woniuxy.entiy;

public class Test {
	private int A;
	private int B;
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Test(int a, int b) {
		super();
		A = a;
		B = b;
	}
	public int getA() {
		return A;
	}
	public void setA(int a) {
		A = a;
	}
	public int getB() {
		return B;
	}
	public void setB(int b) {
		B = b;
	}
	@Override
	public String toString() {
		return "Test [A=" + A + ", B=" + B + "]";
	}
	

}
