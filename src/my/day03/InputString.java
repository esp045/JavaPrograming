package my.day03;
import java.util.*;

public class InputString {

	public static void main(String[] args) {
		
		String name;
		int age;
		String num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��Ͻÿ�: ");
		name = scan.nextLine();
		
		System.out.print("���̸� �Է��Ͻÿ�: ");
		age = scan.nextInt();
		
		System.out.print("��ȭ��ȣ�� �Է��Ͻÿ�: ");
		num = scan.next();
		
		System.out.println(name +"�� �ȳ��ϼ���! " +age +"���̽ó׿�. \n" +"��ȭ��ȣ�� " +num +"�Դϴ�.");
	}

}
