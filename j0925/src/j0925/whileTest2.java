package j0925;

import java.util.Scanner;

public class whileTest2 {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("출력할 단을 입력 : ");
		int dan = s1.nextInt();
		int i=1;
		while(i<=19) {
			//System.out.println(dan + " × "+i +" = "+dan*i );
			System.out.printf("%d × %d = %d\n", dan,i,dan*i);
			i++;
		}
	}

}
