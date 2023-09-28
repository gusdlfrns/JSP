package j0925;

public class VarTest {

	public static void main(String[] args) {
		final double PI = 3.141592;
		double area;
		double radius = 5.0;
		area=PI*radius*radius;
		System.out.println("원의 면적은 ? "+area+"(반지름이 5cm인 경우)");
		
		radius=11.5;
		area=PI*radius*radius;
		System.out.println("원의 면적은 ? "+area+"(반지름이 11cm인 경우)");
		
		/*PI=3.14;//상수는 한번 정해주면은 프로그램 중간에 값을 변경할 수 없다.*/
	}

}
