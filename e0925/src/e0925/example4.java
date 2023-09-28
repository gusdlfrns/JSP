package e0925;

import java.util.Scanner;

public class example4 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int firstNum, lastNum, addNum;
		int sum=0;
		System.out.println("첫번째 값을 입력하세요 : ");
		firstNum=s1.nextInt();
		System.out.println("마지막 값을 입력하세요 : ");
		lastNum=s1.nextInt();
		System.out.println("증가값을 입력하세요 : ");
		addNum=s1.nextInt();
		
		for(int i=firstNum; i<=lastNum; i=i+addNum) {
			sum += i;
		}
		
		System.out.println(firstNum+"에서 "+lastNum+"까지 "+addNum+"씩 증가한 값: "+sum);
	}

}
