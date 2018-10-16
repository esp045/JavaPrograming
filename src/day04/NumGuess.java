package day04;

import java.util.*;
public class NumGuess {

	public static void main(String[] args) {
		int num = 0, guess = 0;
		Random random = new Random();
		Scanner scan = new Scanner(System.in);
		int answer = random.nextInt(100);
		do {		
			System.out.print("수를 입력하시오: ");
			int guess1 = scan.nextInt();
			
			num += 1;
			if(guess1 < answer)
				System.out.println("LOW");
			if(guess1 > answer)
				System.out.println("HIGH");
			if(guess1 == answer) {
			System.out.println("축하합니다. 시도횟수: " +num);
			break;
			}
		} while(guess != answer);

			}
	}
	



