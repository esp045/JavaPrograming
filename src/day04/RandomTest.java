package day04;

import java.util.*;

/**
 * 
 * 
 * Random클래스를 사용하여 1~3까지의 상수를 생성하고, 출력하시오
 *
 */
public class RandomTest {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("수를 입력하시오: ");
		int x = scan.nextInt();
		for(int i=0; i<x; i++)
		System.out.println(ran.nextInt(3) + 1);

	}

}
