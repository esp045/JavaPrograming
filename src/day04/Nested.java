package day04;

import java.util.Scanner;
public class Nested {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�:");
		int number1 = sc.nextInt();
		if(number1 > 0) {
			System.out.println("����Դϴ�.");
		}
		else if(number1 == 0) {
			System.out.println("0�Դϴ�.");
		}
		else {
			System.out.println("�����Դϴ�.");

		}
	}
}
