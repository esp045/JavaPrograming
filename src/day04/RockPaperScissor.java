package day04;

import java.util.*;
public class RockPaperScissor {
	final int SCISSOR = 0;
	final int ROCK = 1;
	final int PAPER = 2;
	
	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.print("����(0), ����(1), ��(2):");
		int user = sc.nextInt();
		
		int com = random.nextInt(3);
		if(user == com)
			System.out.println("�ΰ��� ��ǻ�Ͱ� �����");
		else if((user == 0) && (com == 2) || (user == 1) && (com == 0) || (user == 2) && (com == 1))
			System.out.println("�ΰ�: " + user +" ��ǻ��: " + com + "  �ΰ� �¸�");
		else if((com == 0) && (user == 2) || (com == 1) && (user == 0) || (com == 2) && (user == 1))
			System.out.println("�ΰ�: " + user +" ��ǻ��: " + com + "  ��ǻ�� �¸�");
		else
			System.out.println("�߸��� �Է��Դϴ�.");
	}

}
