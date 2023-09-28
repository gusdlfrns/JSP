package j0925;
import java.util.Scanner;

public class MaxTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);		
		
		int num1,num2;
		System.out.print("첫번째 점수 입력 : ");
		num1=s1.nextInt();		
		System.out.println("두번째 점수 입력 : ");
		num2=s1.nextInt();
		if(num1>num2) {
			System.out.println("큰 수는 "+num1+"입니다.");
		}else if(num1==num2){
			System.out.println("두 수는 같습니다.");
		}else {
			System.out.println("큰 수는 "+num2+"입니다.");
		}
	}

}
