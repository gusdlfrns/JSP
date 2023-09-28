package j0925;

import java.util.Scanner;

public class IfTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("정수 입력 : ");		
		int num=s1.nextInt();
		
		if(num>=100) {
			System.out.println(num+"은 100보다 같거나 큽니다.");
		}
		else {
			System.out.println(num+"은 100보다 작습니다.");
		}
	}

}
