package j0925;

import java.util.Scanner;

public class SearchDay {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("일수를 알고싶은 월을 입력하시오. : ");
		int month= s1.nextInt();
		
		switch(month) {
		case 1:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 3:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 5:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 7:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 8:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 10:
			System.out.println(month+"월의 날 수는 31일");
			break;
		case 12:
			System.out.println(month+"월의 날 수는 31일");
			break;
		
		case 4:
			System.out.println(month+"월의 날 수는 30일");
			break;
		case 6:
			System.out.println(month+"월의 날 수는 30일");
			break;
		case 9:
			System.out.println(month+"월의 날 수는 30일");
			break;
		case 11:
			System.out.println(month+"월의 날 수는 30일");
			break;
			
		case 2:
			System.out.println(month+"월의 날 수는 28일(윤달일 경우 : 29일)");
			break;
		
		default:
			System.out.println("해당 월은 존재하지 않습니다.");
		}
	}

}
