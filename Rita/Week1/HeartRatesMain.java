import java.util.Scanner ;

public class HeartRatesMain {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		System.out.print("Enter your first name:");
		String fName = input.nextLine();
		System.out.print("Enter your last name:");
		String lName = input.nextLine();
		System.out.print("Enter your day of birth in figures:");
		int day = input.nextInt();
		System.out.print("Enter your month of birth in figures:");
		int month = input.nextInt();
		System.out.print("Enter your year of birth in figures:");
		int year = input.nextInt();
		
		HeartRates heartTarget = new HeartRates(fName, lName, day, month, year) ;
		
		System.out.printf("Hello %s %s born on %d/%d/%d\n", heartTarget.getFirstName(),heartTarget.getLastName(),heartTarget.getDayOfBirth(),heartTarget.getMonthOfBirth(),heartTarget.getYearOfBirth());
		System.out.printf("Your age is %d\n", heartTarget.getAge());
		System.out.printf("Your maximum heart rate is %d:\n", heartTarget.maximumHeartRate());
		heartTarget.targetHeartRate();
		
		
		

	}

}
