package j0925;

public class light {

	public static void main(String[] args) {
		long lightspeed=300000;
		long distance;
		distance=lightspeed*365*24*60*60;
		
		System.out.println("빛이 1년 동안 가는 거리(LY) : "+distance+"km");
		//int로 쓸경우 -값이 나온다...
	}

}
