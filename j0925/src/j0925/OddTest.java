package j0925;

import java.util.Scanner;

public class OddTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num=s1.nextInt();
		if(num%2==0) {
			System.out.println("입력된 수는 짝수입니다.");
		}else {
			System.out.println("입력된 수는 홀수입니다.");
		}
	}

}
