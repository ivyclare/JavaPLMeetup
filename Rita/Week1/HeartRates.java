
public class HeartRates {
	
	private String firstName;
	private String lastName;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	
	
	public HeartRates(String firstName, String lastName, int dayOfBirth, int monthOfBirth, int  yearOfBirth) 
		{
			this.firstName = firstName;
			this.lastName = lastName;
			this.dayOfBirth = dayOfBirth;
			this.monthOfBirth = monthOfBirth;
			this.yearOfBirth = yearOfBirth;
		}
	
	public int maximumHeartRate()
		{
			
			return (220-getAge());
		}
	
	public int getAge() 
		{
		
			return (2018 - yearOfBirth) ;
		}
	public void targetHeartRate()
		{
		
			System.out.printf("Your TargetHeartRate is %.2f to %.2f \n", (0.5* maximumHeartRate()),(0.85* maximumHeartRate())) ;
		}
	
	public void setFirstName(String name) 
		{
			name = firstName ;
		}
	public String getFirstName()
		{
			return firstName;
		}
	public void setlastName(String Name) 
		{
			Name = lastName ;
		}
	public String getLastName()
		{
			return lastName ;
		}
	public void setDayOfBirth(int Day) 
		{
			Day = dayOfBirth ;
		} 
	public int getDayOfBirth() 
		{
			return dayOfBirth ;
		}
	public void setMonthOfBirth(int Month) 
		{
			Month = monthOfBirth ;
		} 
	public int getMonthOfBirth() 
		{
			return monthOfBirth ;
		}
	public void setYearOfBirth(int Year) 
		{
			Year = yearOfBirth ;
		} 
	public int getYearOfBirth() 
		{
			return yearOfBirth ;
		}
	
	}
