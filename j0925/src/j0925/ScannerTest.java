package j0925;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		int num1, num2;
		
		/*System.out.println("정수 1 입력 : ");
		num1=s1.nextInt();
		System.out.println("정수 2 입력 : ");
		num2=s1.nextInt();*/
		
		/*System.out.println(num1 +" + "+num2+" = "+(num1+num2));
		System.out.println(num1 +" - "+num2+" = "+(num1-num2));
		System.out.println(num1 +" × "+num2+" = "+(num1*num2));
		System.out.println(num1 +" ÷ "+num2+" = "+(num1/num2));
		System.out.println(num1 +" % "+num2+" = "+(num1%num2));*/
		
		String str;
		System.out.print("문장을 입력하세요 : ");
		str=s1.nextLine();
		System.out.println("str : "+str);
	}

}
