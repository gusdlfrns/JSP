package e0925;

import java.util.Scanner;

public class example01 {

	public static <Patton> void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1, num2;
		String position;
		System.out.println("첫번째 계산할 값을 입력하세요 ==> ");
		num1=s1.nextInt();
		s1.nextLine();
		System.out.println("+ - * / %");
		position=s1.nextLine();
		System.out.println("두번째 계산할 값을 입력하세요 ==> ");
		num2=s1.nextInt();
		
		switch(position) {
		case "+":
			System.out.printf("%d + %d = %d",num1,num2,num1+num2);
			break;
		case "-":
			System.out.printf("%d - %d = %d",num1,num2,num1-num2);
			break;
		case "*":
			System.out.printf("%d * %d = %d",num1,num2,num1*num2);
			break;
		case "/":
			if(num2==0) {
				System.out.println("0으로 나누면 안됩니다.");
			}else {
				System.out.printf("%d / %d = %d",num1,num2,num1/num2);
			}
			break;
		case "%":
			if(num2==0) {
				System.out.println("0으로 나누면 안됩니다.");
			}else {
				System.out.printf("%d % %d = %d",num1,num2,num1%num2);
			}
			break;
		default:
			System.out.println("제대로 입력하시지 않으셨습니다. 다시 실행해주십시오.");
		}
	}

}
