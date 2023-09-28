package j0925;

import java.util.Scanner;

public class ScoreTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);		
		
		int myScore;
		System.out.print("점수를 입력하세요 : ");
		myScore=s1.nextInt();
		if(myScore>100||myScore<0) {
			System.out.println("잘못 입력하셨습니다.");
		}else if(myScore>=90) {
			System.out.println("A학점 입니다.");
		}else if(myScore>=80) {
			System.out.println("B학점 입니다.");
		}else if(myScore>=70) {
			System.out.println("C학점 입니다.");
		}else if(myScore>=60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
	}

}
