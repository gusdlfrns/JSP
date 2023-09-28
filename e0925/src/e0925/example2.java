package e0925;

import java.util.Scanner;

public class example2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1, num2;
		String position;
		
		
		for(int i=1;i<=i;i++) {
			System.out.println("계산할 첫번째 수 입력(종료:999) : ");
			num1=s1.nextInt();		
			if(num1==999) {
				System.out.println("계산기를 종료하겠습니다.");
				break;
			}
			System.out.println("계산할 두번째 수 입력 : ");
			num2=s1.nextInt();
			s1.nextLine();
			System.out.println("계산할 연산자를 입력하세요(+,-,*,/,%) : ");
			position=s1.nextLine();
			switch(position) {
			case "+":
				System.out.println(num1 + " + " +num2+" = "+(num1+num2)+"입니다.");
				break;
			case "-":
				System.out.println(num1 + " - " +num2+" = "+(num1-num2)+"입니다.");
				break;
			case "*":
				System.out.println(num1 + " * " +num2+" = "+(num1*num2)+"입니다.");
				break;
			case "/":
				if(num2==0) {
					System.out.println("0으로 나누면 안됩니다.");
				}else {
					System.out.println(num1 + " / " +num2+" = "+(num1/num2)+"입니다.");
				}
				break;
			case "%":
				if(num2==0) {
					System.out.println("0으로 나누면 안됩니다."+"입니다.");
				}else {
					System.out.println(num1 + " % " +num2+" = "+(num1%num2)+"입니다.");
				}
				break;
			default:
				System.out.println("제대로 입력하시지 않으셨습니다. 다시 실행해주십시오.");
			}
			
			
		}
		
	}
}
