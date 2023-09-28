package j0925;

public class LogicalTest {

	public static void main(String[] args) {
		int x=3;
		int y=4;
		System.out.println((x==y)&&(y==4));
		System.out.println((x==3)||(y==5));
		
		x=10;
		y=3;
		System.out.println((float)y);
		System.out.println("x / y = "+(x/y));
		System.out.println("x / y = "+(x/(float)y));
		
		int i;
		i=(int)1.3+(int)1.8;
		System.out.println("i : "+ i);
	}

}
