package e0925;

public class example3 {

	public static void main(String[] args) {
		int sumOdd = 0;
		int sumEven = 0;
		for (int i=1; i<=100; i++) {
			if(i%2==1) {
				sumOdd += i;
			}
			else {
				sumEven += i;
			}
		}
		System.out.println("1부터 100까지의 홀수의 합 : "+sumOdd);
		System.out.println("1부터 100까지의 짝수의 합 : "+sumEven);
	}

}
