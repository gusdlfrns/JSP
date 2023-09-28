package p0920;

public class test2 {

	public static void main(String[] args) {
		int num = 100;
		float f1 = 100.5f;
		double d1=100.5;
		long l1=100;
		
		System.out.printf("num = %x\n", num);//o는 8진수, x는 16진수
		System.out.printf("float = %6.2f\n", f1);
		System.out.printf("double = %.3f\n", d1);
		System.out.printf("long = %05d\n", l1);
	}
}
