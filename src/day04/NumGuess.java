package day04;

import java.util.*;
public class NumGuess {

	public static void main(String[] args) {
		int num = 0, guess = 0;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int answer = random.nextInt(100);
		do {		
			System.out.print("���� �Է��Ͻÿ�: ");
			int guess1 = scan.nextInt();
			
			num += 1;
			if(guess1 < answer)
				System.out.println("LOW");
			if(guess1 > answer)
				System.out.println("HIGH");
			if(guess1 == answer) {
			System.out.println("�����մϴ�. �õ�Ƚ��: " +num);
			break;
			}
		} while(guess != answer);

			}
	}
	



