package datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Format {

	public static void main(String[] args) {
		LocalDate now = LocalDate.now();
		LocalDateTime ldt = LocalDateTime.now();
		
		DateTimeFormatter standartFormat = DateTimeFormatter.ISO_LOCAL_DATE;
		DateTimeFormatter f1 = DateTimeFormatter.ISO_ORDINAL_DATE;
		DateTimeFormatter f2 = DateTimeFormatter.ISO_LOCAL_TIME;
		DateTimeFormatter f3 = DateTimeFormatter.ISO_WEEK_DATE;
		System.out.println(standartFormat.format(now));
		System.out.println(f1.format(now));
		System.out.println(f2.format(ldt));
		System.out.println(f3.format(now));
		System.out.println(f3.format(ldt));
	}

}
