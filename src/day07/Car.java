package day07;

public class Car {
	int speed;
	int distance;
	String color;
	char year;
	String brand;
	
	public Car() {}
	
	public Car(int speed, int distance, String color, char year, String brand) {
	this.speed = speed;
	this.distance = distance;
	this.color = color;
	this.year = year;
	this.brand = brand;
	}
	
	public void speedup() {
		speed = speed + 5;
	}
	
	public void breakdown() {
		speed = speed - 10;
	}
	
	public void opendoor() {
		System.out.println("¹®ÀÌ ¿­·È½À´Ï´Ù.");
	}
	
	public void closedoor() {
		System.out.println("¹®ÀÌ ´ÝÇû½À´Ï´Ù.");
	}
	
	public int getcurrentSpeed() {
		return speed;
	}
	
	public static void main(String[] args) {

		
		

	}

}
