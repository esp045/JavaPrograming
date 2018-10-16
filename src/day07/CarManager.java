package day07;

public class CarManager {

	public static void main(String[] args) {
		Car porsche = new Car();
		porsche.speedup();
		System.out.println(porsche.getcurrentSpeed());
		
		porsche.breakdown();
		System.out.println(porsche.getcurrentSpeed());
		
		porsche.opendoor();
		
		porsche.closedoor();

	}

}
