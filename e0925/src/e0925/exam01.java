package e0925;

import java.util.Scanner;

public class exam01 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("원의 면적을 입력을 하시오. : ");
		int num = s1.nextInt(); 
		double radius=(num*num)*3.141592;
		if(num<=0) {
			System.out.println("입력하신 수는 없습니다.");
		}else {
			System.out.println("원 반지름이 "+num+"의 면적은 "+radius+"입니다.");
		}
	}

}
