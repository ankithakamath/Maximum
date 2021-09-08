package com.yml.max;


public class Refactor2<T extends Comparable<T>> {
	public T x, y, z;

	public Refactor2(T x, T y, T z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public void findMax() {
		T max = Refactor2.findMaximum(x, y, z);
	}

	
	public static <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		System.out.println("\nMaximum of " + x + "," + y + " and " + z + " is " + max);
		return max;

	}

	public static void main(String[] args) {
		String x1 = "lilly", y1 = "ankitha", z1 = "mulan";
		Refactor2 t1 = new Refactor2(x1, y1, z1);
		t1.findMax();
		int x2 = 20, y2 = 30, z2 = 40;
		Refactor2 t2 = new Refactor2(x2,y2,z2);
		t2.findMax();
		float x3 = 20.2f, y3 = 30.4f, z3 = 40.6f;
		Refactor2 t3 = new Refactor2(x3,y3,z3);
		t3.findMax();
	}

}