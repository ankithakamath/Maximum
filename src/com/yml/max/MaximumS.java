package com.yml.max;


	public class MaximumS {
		
		String x,y,z;
	public MaximumS(String x,String y,String z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		public String findMax(String x,String y, String z) {
			String max=x;
			if(y.compareTo(max)>0) {
				
				max=y;
			}
			if(z.compareTo(max)>0) {
				max=z;
			}
			
			System.out.println("Maximum of "+x+","+y+" and "+z+" is =" +max);
			return max;
		}

	public static void main(String args[]) {
		String x1 = "Kamath", y1 = "Attendance", z1 = "Holiday";
		MaximumS a=new MaximumS(z1, z1, z1);
		a.findMax(x1,y1,z1);
		String x2 = "Attendance", y2 = "lilly", z2 = "Holiday";
		MaximumS b=new MaximumS(z2, z2, z2);
		b.findMax(x2,y2,z2);
		String x3 = "happy", y3 = "Birthday", z3 = "mulan";
		MaximumS c=new MaximumS(z3, z3, z3);
		c.findMax(x3,y3,z3);
	}
	}