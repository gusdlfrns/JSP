package e0925;

import java.util.Scanner;

public class example7 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int menu;
		
		do {
			System.out.println("손님 주문하시겠습니까?\n");
			System.out.println("<1> 카페라떼 <2>카푸치노 <3>아메리카노 <4>그만시킬레요 ==> ");
			menu=s1.nextInt();
			switch(menu) {
			case 1:
				System.out.println("#카페라떼 주문하였습니다.");
				break;
			case 2:
				System.out.println("#카푸치노 주문하였습니다.");
				break;
			case 3:
				System.out.println("#아메리카노 주문하였습니다.");
				break;			
			case 4:
				System.out.println("주문하신 커피 준비하겠습니다.");
				break;
			default:
				System.out.println("없는 메뉴입니다.다시 주문 부탁드리겠습니다.");
			}	
		}while(menu!=4);
		
		
	}
}
