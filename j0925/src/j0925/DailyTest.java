package j0925;

import java.util.Date;

public class DailyTest {

	public static void main(String[] args) {
		Date date = new Date();
		int currentHour=date.getHours();
		System.out.println("현재시간 : "+currentHour);
		
		if(currentHour<11) {
			System.out.println("Good Morning");
		}else if(currentHour<16) {
			System.out.println("Good Afternoon");
		}else if(currentHour<20) {
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
	}

}
