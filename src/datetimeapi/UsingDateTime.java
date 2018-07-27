package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.TemporalAmount;

public class UsingDateTime {

	public static void main(String[] args) {
		
		
		LocalDate someBirthday=LocalDate.of(1989, Month.JUNE, 18);
		LocalDate otherDate=LocalDate.of(1989, 6, 18);
		System.out.println(someBirthday);
		System.out.println(otherDate);
		
		LocalTime lunchTime1 = LocalTime.of(13, 0);
		LocalTime lunchTime2 = LocalTime.of(13, 0, 55);
		LocalTime lunchTime3 = LocalTime.of(13, 0, 55, 444);
		System.out.println(lunchTime1);
		System.out.println(lunchTime2);
		System.out.println(lunchTime3);
		
		LocalDateTime rightNow = LocalDateTime.of(2018, Month.FEBRUARY, 11, 11, 35, 29, 111);
		LocalDateTime rightNow2 = LocalDateTime.of(someBirthday, lunchTime3);
		System.out.println(rightNow);
		System.out.println(rightNow2);
		
		LocalDateTime twoYearsLater = rightNow.plusYears(2);
		LocalDateTime threeWeeksLater = rightNow.plusWeeks(3);
		System.out.println(twoYearsLater);
		System.out.println(threeWeeksLater);
		System.out.println(someBirthday.plusYears(28));
		System.out.println(someBirthday.plusMonths(28*12));
		System.out.println(someBirthday.plusWeeks(5));
		
	
		
		

	}

	
	

}
