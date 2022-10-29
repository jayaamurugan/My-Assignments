package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Applied break");
		
	}
	public void soundHorn() {
		System.out.println("sound horn");
		
	}
	public static class Bike{
		public void applyBreak() {
			System.out.println("Applied break");
		}
		public void soundHorn() {
			System.out.println("sound horn");
			
		}
		
	
		public  static void main(String[] args) {
			Car c1=new Car();
			Bike b=new Bike();
			c1.applyBreak();
			c1.soundHorn();
			b.applyBreak();
			b.soundHorn();
			
			
		}
	}

}
