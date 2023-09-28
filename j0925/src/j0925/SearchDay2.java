package j0925;

import java.util.Scanner;

public class SearchDay2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		System.out.println("일수를 알고싶은 월을 입력하시오. : ");
		int month= s1.nextInt();
		
		if(month<=0||month>12) {
			System.out.println("해당 월은 존재하지 않습니다.");
		}else if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
			System.out.println(month+"월의 날 수는 31일");
		}else if(month==4||month==6||month==9||month==11) {
			System.out.println(month+"월의 날 수는 30일");
		}else {
			System.out.println(month+"월의 날 수는 28일(윤달일 경우 : 29일)");
		}

	}

}
