package j0925;

import java.util.Scanner;

public class DoWhileTest2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int month;
		do {
			System.out.print("올바른 달을 입력하세요[1~12] : ");
			month = s1.nextInt();
		}while(month<1||month>12);
		System.out.println("사용자가 입력한 달은 "+month+"월");

	}

}
