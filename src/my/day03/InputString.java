package my.day03;
import java.util.*;

public class InputString {

	public static void main(String[] args) {
		
		String name;
		int age;
		String num;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하시오: ");
		name = scan.nextLine();
		
		System.out.print("나이를 입력하시오: ");
		age = scan.nextInt();
		
		System.out.print("전화번호를 입력하시오: ");
		num = scan.next();
		
		System.out.println(name +"님 안녕하세요! " +age +"살이시네요. \n" +"전화번호는 " +num +"입니다.");
	}

}
