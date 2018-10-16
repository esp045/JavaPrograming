package day04;

import java.util.Scanner;

public class StringSwitch {

	public static void main(String[] args) {
		
		String month;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("월의 이름을 입력하시오: ");
		month = scan.next();
		
		int number;
		switch(month) {
		case "january":
			number = 1;
			break;
		case "february":
			number = 2;
			break;
		case "march":
			number = 3;
			break;
		case "april":
			number = 4;
			break;
		case "may":
			number = 5;
			break;
		case "june":
			number = 6;
			break;
		case "july":
			number = 7;
			break;
		case "august":
			number = 8;
			break;
		case "september":
			number = 9;
			break;
		case "october":
			number = 10;
			break;
		case "november":
			number = 11;
			break;
		case "december":
			number = 12;
			break;
		default:
			number = 0;
			break;
			}
			System.out.println(number+"월");
		}

}
