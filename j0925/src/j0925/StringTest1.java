package j0925;

import java.util.Scanner;

public class StringTest1 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("월의 이름을 입력하세요 : ");
		String mon=s1.next();
		switch(mon) {
		case "january":
			System.out.println("1월");
			break;
		case "february":
			System.out.println("2월");
			break;
		case "march":
			System.out.println("3월");
			break;
		case "april":
			System.out.println("4월");
			break;
		case "may":
			System.out.println("5월");
			break;
		case "june":
			System.out.println("6월");
			break;
		case "july":
			System.out.println("7월");
			break;
		case "augest":
			System.out.println("8월");
			break;
		case "september":
			System.out.println("9월");
			break;
		case "october":
			System.out.println("10월");
			break;
		case "november":
			System.out.println("11월");
			break;
		default:
			System.out.println("12월");
		}
	}

}
