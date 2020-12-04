package com.javaex.ex02;

public class Point {
	private int x;
	private int y;

	public Point() {
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected int getX() {
		return x;
	}
	protected void setX(int x) {
		this.x = x;
	}
	protected int getY() {
		return y;
	}
	protected void setY(int y) {
		this.y = y;
	}
	
	public void showInfo() {
		System.out.println("x: " + x + " y: " +y);
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
