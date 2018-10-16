package day04;

import java.util.*;
public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("가위(0), 바위(1), 보(2):");
		int user = sc.nextInt();
		
		int com = random.nextInt(3);
		if(user == com)
			System.out.println("인간과 컴퓨터가 비겻음");
		else if((user == 0) && (com == 2) || (user == 1) && (com == 0) || (user == 2) && (com == 1))
			System.out.println("인간: " + user +" 컴퓨터: " + com + "  인간 승리");
		else if((com == 0) && (user == 2) || (com == 1) && (user == 0) || (com == 2) && (user == 1))
			System.out.println("인간: " + user +" 컴퓨터: " + com + "  컴퓨터 승리");
		else
			System.out.println("잘못된 입력입니다.");
	}

}
