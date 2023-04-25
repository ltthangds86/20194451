import java.util.Scanner; 
public class Problem63 { 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         
	System.out.print("Enter the month: ");
	String month = input.nextLine();        
        switch (month) {
            case "1": case "3": case "5": case "7": case "8": case "10": case "12": case "January": case "March": case "May": case "July": case "August": case "October": case "December": case "Jan.": case "Mar.": case "Aug.": case "Oct.": case "Dec.": case "Jan": case "Mar": case "Jul": case "Aug": case "Oct": case "Dec":
                System.out.println("31 days");
                break;
            case "4": case "6": case "9": case "11": case "April": case "June": case "September": case "November": case "Apr.": case "Sept.": case "Nov.": case "Apr": case "Jun": case "Sep": case "Nov":
                System.out.println("30 days");
                break;
            case "2": case "February": case "Feb.": case "Feb":
                int year;
                System.out.println("Enter the year: ");
                year = input.nextInt();
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("29 days");
                } else {
                    System.out.println("28 days");
                }
                break;
            default:
                System.out.println("invalid");
            }
    }
 
}