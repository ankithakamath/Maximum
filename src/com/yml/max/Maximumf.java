package com.yml.max;


	public class Maximumf {
		
		 Float x,y,z;
		
	public Maximumf(float x,float y,float z){
			this.x=x;
			this.y=y;
			this.z=z;
		}
		
		public Float findMax(Float x,Float y,Float z) {
			 Float max = x;
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
		Float x1=40.3f,y1=25.4f,z1=36.2f;
		Maximumf a =new Maximumf(x1,y1,z1);
		a.findMax(x1,y1,z1);
		Float x2=22.4f,y2=57.5f,z2=36.8f;
		Maximumf b =new Maximumf(x2,y2,z2);
		b.findMax(x2,y2,z2);
		Float x3=10.9f,y3=50.4f,z3=100.0f;
		Maximumf c =new Maximumf(x3,y3,z3);
		c.findMax(x3,y3,z3);
	}
	}