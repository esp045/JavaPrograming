package day04;

import java.util.*;

/**
 * 
 * 
 * RandomŬ������ ����Ͽ� 1~3������ ����� �����ϰ�, ����Ͻÿ�
 *
 */
public class RandomTest {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�: ");
		int x = scan.nextInt();
		for(int i=0; i<x; i++)
		System.out.println(ran.nextInt(3) + 1);

	}

}
