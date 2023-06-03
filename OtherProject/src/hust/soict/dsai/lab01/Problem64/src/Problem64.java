package hust.soict.dsai.lab01.Problem64.src;
import java.util.Scanner;
public class Problem64 {
	public static boolean checkNumeric(String str) {
		boolean check = true;
		try {
			Integer.parseInt(str);
		}
		catch(NumberFormatException e) {
			check = false;
		}
		return check;
	}
	public static int numDay(String month, String year_str) {
		int numOfDay = 0;
		int year = Integer.parseInt(year_str);
		if (month.equals("1") || month.equals("January")||month.equals("Jan")||month.equals("Jan.") ) {
			numOfDay = 31;
		}
		
		if (month.equals("2") || month.equals("Febuary")||month.equals("Feb")||month.equals("Feb.") ) {
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numOfDay = 29;
            } 
			else {
            	numOfDay = 28;
            }
		}
		if (month.equals("3") || month.equals("March")||month.equals("Mar")||month.equals("Mar.") ) {
			numOfDay = 31;
		}
		if (month.equals("4") || month.equals("April")||month.equals("Apr")||month.equals("Apr." )) {
			numOfDay = 30;
		}
		if (month.equals("5") || month.equals("May")||month.equals("May")||month.equals("May") ) {
			numOfDay = 31;
		}
		if (month.equals("6") || month.equals("June")||month.equals("Jun")||month.equals("June") ) {
			numOfDay = 30;
		}
		if (month.equals("7") || month.equals("July")||month.equals("Jul")||month.equals("July" )) {
			numOfDay = 31;
		}
		if (month.equals("8") || month.equals("August")||month.equals("Aug")||month.equals("Aug.") ) {
			numOfDay = 31;
		}
		if (month.equals("9") || month.equals("September")||month.equals("Sep")||month.equals("Sept.") ) {
			numOfDay = 30;
		}
		if (month.equals("10") || month.equals("October")||month.equals("Oct")||month.equals("Oct.") ) {
			numOfDay = 31;
		}
		if (month.equals("11") || month.equals("November")||month.equals("Nov")||month.equals("Nov." )) {
			numOfDay = 30;
		}
		if (month.equals("12") || month.equals("December")||month.equals("Dec")||month.equals("Dec." )) {
			numOfDay = 31;
		}
		return numOfDay;
	}
	
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		
		String year;
		do {
			System.out.print("enter year:");
			year = sc.next();
		} while(checkNumeric(year) == false || Integer.parseInt(year) <=0);
		
		String month;
		do {
			System.out.print("enter month:");
			month=sc.next();
		} while(numDay(month,year) == 0);
			
		System.out.println("Number of days: "+numDay(month,year));
	}
}
