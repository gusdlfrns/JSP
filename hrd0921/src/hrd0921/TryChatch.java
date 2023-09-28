package hrd0921;

public class TryChatch {

	public static void main(String[] args) {
		int num1=100;
		int num2=0;
		try {
			System.out.println("나누기 : "+num1/num2);
		}catch(Exception e) {
			System.out.println("에러 : "+e.getMessage());
		}
	}
}
