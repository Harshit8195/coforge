package CoreJavaPac;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
public class Lab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the date (yyyy-mm-dd): ");
		String date = sc.nextLine();
		LocalDate givenDate = LocalDate.parse(date);
		LocalDate currentDate = LocalDate.now();
		Period period = Period.between(givenDate, currentDate);
		System.out.println("Duration from given date to current date: ");
		System.out.println(period.getYears()+ "Years");
		System.out.println(period.getMonths()+ "Months");
		System.out.println(period.getDays()+ "Days");

	}

}
