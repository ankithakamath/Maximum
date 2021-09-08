package com.yml.max;


	public class Maximum {
		
		public static Integer x,y,z;
	Maximum(Integer x,Integer y,Integer z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		public static void findMax() {
			Integer max=x;
			if(y.compareTo(max)>0) {
				
				max=y;
			}
			if(z.compareTo(max)>0) {
				max=z;
			}
			
			System.out.println("Maximum of "+x+","+y+" and "+z+" is =" +max);
			
		}

	public static void main(String args[]) {
		Integer x1=40,y1=25,z1=39;
		Maximum a=new Maximum(x1,y1,z1);
		a.findMax();
		Integer x2=22,y2=57,z2=36;
		Maximum b=new Maximum(x2,y2,z2);
		b.findMax();
		Integer x3=10,y3=50,z3=100;
		Maximum c=new Maximum(x3,y3,z3);
		c.findMax();
	}
	}