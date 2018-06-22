package generic;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class ConvertDate {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat date = new SimpleDateFormat("dd MMM yyyy");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String stringDate = date.format(input);
		System.out.println("Date in English is: " + stringDate);

	}

}
