package j0925;

import java.util.Scanner;

public class SwitchScore {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);		
		
		int myScore;
		System.out.print("점수를 입력하세요 : ");
		myScore=s1.nextInt();
		int scr=myScore/10;
		switch(scr) {
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
		}
	}
}
