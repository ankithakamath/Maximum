package com.yml.max;

public class Refactor1 {
	
	public <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("Maximum of "+x+","+y+" and "+z+" is =" +max);
		return max;

	}

	public static void main(String[] args) {
		String x1 = "lilly", y1 = "ankitha", z1 = "mulan";
		Refactor1 t1 = new Refactor1();
		t1.findMaximum(x1, y1, z1);
		int x2 = 20, y2 = 30, z2 = 40;
		Refactor1 t2 = new Refactor1();
		t2.findMaximum(x2, y2, z2);
		float x3 = 20, y3 = 30, z3 = 40;
		Refactor1 t3 = new Refactor1();
		t3.findMaximum(x3, y3, z3);
	}

}
