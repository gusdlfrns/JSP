package j0925;

import java.util.Scanner;

public class BounsTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);		
		
		final int TargetSales=1000;//1000 값을 고정
		int mySales,Bonus;
		System.out.print("실적을 입력하세요(단위: 만원) : ");
		mySales=s1.nextInt();
		Bonus=((mySales-TargetSales)/10);
		if(mySales>=TargetSales) {
			System.out.println("실적 달성");			
			System.out.println("보너스 : "+Bonus);
		}else {
			System.out.println("실적 미달성");
			System.out.println("보너스는 없습니다.");
		}
	}
}