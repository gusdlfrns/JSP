package e0925;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner (System.in);
		int mileage, gasolin;		
		do {
			System.out.println("주행거리를 입력하세요(km) : ");
			mileage=s1.nextInt();
			System.out.println("연비를 입력하세요(L) : ");
			gasolin=s1.nextInt();
		}while(mileage<1||gasolin<1);
		double FE=((double)mileage/gasolin);
		System.out.println("연비 : "+FE);
	}

}
