package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;



public class Periods {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		LocalDateTime rightNow = LocalDateTime.now();
		
		//Period p1 = Period.ofMonths(2).ofDays(5);
		//Period p2 = Period.ofDays(65);
		Period p3 = Period.of(0, 2, 5);
		System.out.println(now.plus(p3));
		System.out.println(rightNow.plus(p3));
		
		
		

		
		

	}

}
