package j0925;

public class WhileTest1 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		while(i<=10) {
			System.out.println(i);
			sum += i;//sum = sum+i
			i++;
		}
		System.out.println("합 : "+sum);
	}

}
