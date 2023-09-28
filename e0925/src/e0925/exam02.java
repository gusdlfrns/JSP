package e0925;

import java.util.Scanner;

public class exam02 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int weight,height;
		do {
			System.out.println("가로를 입력하세요. : ");
			weight=s1.nextInt();
			System.out.println("세로를 입력하세요. : ");
			height=s1.nextInt();
		}while(weight<1||height<1);
		float width, circu;
		width=weight*height;
		circu=(weight+height)*2;
		System.out.println("사각형의 넓이는 : "+width);
		System.out.println("사각형의 둘레는 : "+circu);
	}

}
