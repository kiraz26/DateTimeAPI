package datetimeapi;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class FormattingMore {

	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		LocalDateTime birthday=LocalDateTime.of(1989, Month.JUNE, 18, 07, 30, 44);
		
		
		DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter mediumFormat = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
		DateTimeFormatter longFormat = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
		
		
		System.out.println(shortFormat.format(now));
		System.out.println(mediumFormat.format(now));
		System.out.println(longFormat.format(now)); 
		System.out.println(shortFormat.format(birthday));
		System.out.println(mediumFormat.format(birthday));
		System.out.println(longFormat.format(birthday)); 
		
	}

}
