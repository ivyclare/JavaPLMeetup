package heartRates;

import java.io.InputStream;
import java.sql.Date;

public class HeartRates {
	private String FirstName;
	private String SecondName;
	private int YearOfBirth;
	private String MonthOfBirth;
	private int DayOfBirth;
	private String firstName;
	
	HeartRates(InputStream in) {
		// TODO Auto-generated constructor stub
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	    public void setSecondName(String name2)
	    {
		SecondName = name2;
	}
	
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getSecondName()
	{
		return SecondName;
	}
	public void setYearOfBirth(int year)
	{
		YearOfBirth = year;
	}
	public void setMonthOfbirth(String month)
	{
		MonthOfBirth = month;
	}
	public void setDayOfBirth(int day)
	{
		DayOfBirth = day;
	}
	public int getYearOfbirth()
	{
		return YearOfBirth;
	}
	public String getMonthOfBirth()
	{
		return MonthOfBirth;
	}
	public int getDayOfBirth()
	{
		return DayOfBirth;
	}
	
	@SuppressWarnings("deprecation")
	public int displayage()
	{
		int pyear = 0;
		Date t;
		t = new Date(pyear);
		pyear = t.getYear();
		int age = pyear + 1946 -(getYearOfbirth());
		return age;
	}
	public int displayMaxRate()
	{
		
		int maxrate = 220 - displayage();
		return maxrate;
	}
	public int displayTegRate()
	{
		
		int uplimit = (int)(0.85*displayMaxRate());
		return uplimit;
	}
	public int dnlimit()
	{
		return (int)(0.5*displayMaxRate());
	}

}
