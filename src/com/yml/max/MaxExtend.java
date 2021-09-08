package com.yml.max;

import java.util.Arrays;

public class MaxExtend<T extends Comparable<T>> {
	public T x, y, z, max;

	public MaxExtend(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	
	public <T extends Comparable<T>> void findMaximum(T... values) {
		Arrays.sort(values);
		T max = values[values.length - 1];
		printMax(max);
	}

	public <T> void printMax(T max) {
		System.out.println("Max element is" + max);
	}

	public static void main(String[] args) {
		String x1 = "lilly", y1 = "ankitha", z1 = "mulan";
		MaxExtend t1 = new MaxExtend(x1, y1, z1);
		t1.findMaximum(x1, y1, z1);
		Integer num1 = 10, num2 = 20, num3 = 30, num4 = 40, num5 = 50;
		MaxExtend t2 = new MaxExtend(num1, num2, num3);
		t2.findMaximum(num1, num2, num3, num4, num5);
		Float f1 = 29.9f, f2 = 49.8f, f3 =79.79f, f4 = 999.444f;
		MaxExtend t3 = new MaxExtend(f1, f2, f3);
		t3.findMaximum(f1, f2, f3, f4);
	}


}
