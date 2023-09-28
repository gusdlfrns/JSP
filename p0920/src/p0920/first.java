package p0920;

public class first {

	public static void main(String[] args) {
		int num1;
		int num2;
		int result;
		num1 = 100;
		num2 = 30;
		result = num1 + num2;		
		float f1=10.5f;
		double d1=10.5;
		System.out.printf("합계 : %5d\n",result);//<br>
		
		result = num1 - num2;		
		System.out.println("빼기 : "+result);	
		
		result = num1 * num2;		
		System.out.println("곱하기 : "+result);
		
		// num2=0;(에러가 뜬다)
		result = num1 / num2;//여기에 (float)를 쓰면 result가 int이기 때문에 오류가 난다. 		
		System.out.println("나누기 : "+num1/(float)num2);//100/30.0둘중에 하나를 실수로하면 실수가 된다.
		
		result = num1 % num2;		
		System.out.println("나머지 : "+result);
	}
}