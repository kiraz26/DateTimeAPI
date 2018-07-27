package datetimeapi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Immutable {
	public static void main(String[] args) {

		String str = "abc";
		str.replace("a", "d");
		System.out.println(str);
		
		LocalDate now = LocalDate.parse("2018-02-11", DateTimeFormatter.ISO_LOCAL_DATE); 
		System.out.println(now);
		now.plusDays(2); 
		System.out.println(now); //2018-02-11 because of immutable 
		now = now.plusDays(2);
		System.out.println(now); //2018-02-13
		
	}
}
