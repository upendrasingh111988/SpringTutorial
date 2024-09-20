package com.referenceType;

public class A {
	private int x;
	private B bj;
	
	public A() {
		
	}
	public A(int x, B bj) {
		
		this.x = x;
		this.bj = bj;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getBj() {
		return bj;
	}
	public void setBj(B bj) {
		this.bj = bj;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", bj=" + bj + "]";
	}
	

}
