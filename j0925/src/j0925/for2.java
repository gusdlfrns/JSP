package j0925;

public class for2 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100; i++) {
			sum += i;
			if(sum>=2000) {
				System.out.println(i);
				System.out.println("2000보다 큰 시점의 i의 합: "+sum);
				break;
			}
		}
		
	}

}
