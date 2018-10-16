package day07;

import java.util.Random;

public class ArrayTest {

	public static void main(String[] args) {
		int avr;
		
		int[] arr = new int[100];
		Random rand = new Random();
		for(int i = 0; i<arr.length; i++)
		{
			arr[i] = rand.nextInt(100)+1;
		}
		
		int sum = 0;
		for(int i = 0; i<100; i++)
		{
			sum += arr[i];
		}
		avr = sum/100;
		
		System.out.println("100개의 랜덤 정수의 평균 값은" +avr +"입니다.");
	}

}
