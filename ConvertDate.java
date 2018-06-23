package generic;

import java.util.*;

public class ConvertDate {
	public static HashMap<String, String> month = new HashMap<String, String>();
	public static HashMap<String, String> date = new HashMap<String, String>();

	public static String inEnglishMonth(String m) {
		month.put("01", "Jan");
		month.put("02", "Feb");
		month.put("03", "March");
		month.put("04", "April");
		month.put("05", "May");
		month.put("06", "June");
		month.put("07", "July");
		month.put("08", "August");
		month.put("09", "Sept");
		month.put("10", "Oct");
		month.put("11", "Nov");
		month.put("12", "Dec");
		String mon = m.substring(3, 5);
		return month.get(mon);
	}

	public static String inEnglishDate(String d) {

		String dd = d.substring(0, 2);
		date.put("01", "One");
		date.put("02", "Two");
		date.put("03", "Three");
		date.put("04", "Four");
		date.put("05", "Five");
		date.put("06", "Six");
		date.put("07", "Seven");
		date.put("08", "Eight");
		date.put("09", "Nine");
		date.put("10", "Ten");
		date.put("11", "Eleven");
		date.put("12", "Twelve");
		date.put("13", "Thirteen");
		date.put("14", "Fourteen");
		date.put("15", "Fifteen");
		date.put("16", "Sixteen");
		date.put("17", "Seventeen");
		date.put("18", "Eighteen");
		date.put("19", "Nineteen");
		date.put("20", "Twenty");
		date.put("21", "Twenty One");
		date.put("22", "Twenty Two");
		date.put("23", "Twenty Three");
		date.put("24", "Twenty Four");
		date.put("25", "Twenty Five");
		date.put("26", "Twenty Six");
		date.put("27", "Twenty Seven");
		date.put("28", "Twenty Eight");
		date.put("29", "Twenty Nine");
		date.put("30", "Thirty");
		date.put("31", "Thirty One");

		return date.get(dd);

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inDate = sc.next();
		String year = inDate.substring(6, inDate.length());
		System.out.println(inEnglishDate(inDate) + " " + inEnglishMonth(inDate) + " " + year);

	}

}
