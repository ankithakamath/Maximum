package com.yml.max;

import java.util.Arrays;

public class MoreThanThree<T extends Comparable<T>> {
	public T x, y, z, max;

	public MoreThanThree(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	/*
	 * generic method to find max
	 */
	public static <T extends Comparable<T>> void findMaximum(T... values) {
		Arrays.sort(values);
		T max = values[values.length - 1];
		System.out.println("max element is\n" + max);
	}

	public static void main(String[] args) {
		String x1 = "lilly", y1 = "ankitha", z1 = "mulan";
		MoreThanThree t1 = new MoreThanThree(x1, y1, z1);
		t1.findMaximum(x1, y1, z1);
		Integer num1 = 10, num2 = 20, num3 = 30, num4 = 40, num5 = 50;
		MoreThanThree t2 = new MoreThanThree(num1, num2, num3);
		t2.findMaximum(num1, num2, num3, num4, num5);
		Float f1 = 29.9f, f2 = 49.8f, f3 =79.79f, f4 = 999.444f;
		MoreThanThree t3 = new MoreThanThree(f1, f2, f3);
		t3.findMaximum(f1, f2, f3, f4);
	}

}