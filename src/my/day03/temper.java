package my.day03;
import java.util.*;

public class temper {

	public static void main(String[] args) {

		double c;
		double f;
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("È­¾¾¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À: ");
	f = input.nextDouble();

	c = ((5.0/9.0)*(f - 32.0));
	
	System.out.println("¼·¾¾¿Âµµ´Â " +c);

	}

}
