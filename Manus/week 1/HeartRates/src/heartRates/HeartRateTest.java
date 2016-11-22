package heartRates;
import java.util.Scanner;
public class HeartRateTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input;
		HeartRates obj;
		String name1;
		String name2;
		String month;
		int year, day;
		input = new Scanner(System.in);
		obj = new HeartRates(null);
		
		System.out.println("Enter your first name:");
		name1 = input.nextLine();
		obj.setFirstName(name1);
		System.out.println("Enter your second name:");
		name2 = input.nextLine();
		obj.setSecondName(name2);
		System.out.println("Enter your year if birth:");
		year = input.nextInt();
		obj.setYearOfBirth(year);
		System.out.println("Enter your month of birth:");
		month = input.next();
		obj.setMonthOfbirth(month);
		System.out.println("Enter your day of birth:");
		day = input.nextInt();
		obj.setDayOfBirth(day);
		
		
		System.out.println("\n\nFirst name:\t"+obj.getFirstName());
		System.out.println("\nSecond name:\t"+obj.getSecondName());
		System.out.println("\nDate of birth:\t "+obj.getDayOfBirth()+"/"+obj.getMonthOfBirth()+"/"+obj.getYearOfbirth()+"");
		System.out.println("\nAge:\t"+obj.displayage()+"");
		System.out.println("\nMaximum heart rate:\t"+obj.displayMaxRate()+"");
		System.out.println("\nTarget heart rate range:\t"+obj.dnlimit()+" to "+obj.displayTegRate()+"");
	}

}
