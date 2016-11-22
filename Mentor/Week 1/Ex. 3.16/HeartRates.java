/*
 *       Filename:  HeartRates.java
 *
 *    Description:  3.16 - Create a class called HeartRates. The class
 *                  attributes should include:
 *                      String  - first name
 *                      String  - last name
 *                      int     - day
 *                      int     - month
 *                      int     - year
 *                  Your class should have a constructor that receives this data
 *                  as parameters. For each attribute provide setters and
 *                  getters.
 *                  The class should also include methods which:
 *                  calculate and return the person's age in years
 *                  calculate and return the person's maximum heartrate
 *                  calculate and return the person's target heartrate.
 *
 *
 *        Created:  28/09/15 18:43:13
 *       Revision:  none
 *
 *        @Author:  Siidney Watson - siidney.watson.work@gmail.com
 *       @Version:  1.0
 *
 * =====================================================================================
 */
public class HeartRates{
    private String fName;
    private String lName;
    private int bDay, bMonth, bYear;

    // constructor
    public HeartRates(String fName, String lName, int bDay, int bMonth, int bYear){
        setFirstName(fName);
        setLastName(lName);
        setDay(bDay);
        setMonth(bMonth);
        setYear(bYear);
    }
    // setters
    public void setFirstName(String fName){
        this.fName = fName;
    }
    public void setLastName(String lName){
        this.lName = lName;
    }
    public void setDay(int bDay){
        this.bDay = bDay;
    }
    public void setMonth(int bMonth){
        this.bMonth = bMonth;
    }
    public void setYear(int bYear){
        this.bYear = bYear;
    }
    // getters
    public String getFirstName(){
        return fName;
    }
    public String getLastName(){
        return lName;
    }
    // return person's dob
    public String getDOB(){
        return String.format("%d/%d/%d", bDay, bMonth, bYear);
    }
    // calculate and return person's age
    public int getAge(){
        return java.util.Calendar.getInstance().get(java.util.Calendar.YEAR) - bYear;
    }
    // calculate and return max heartrate
    public int getMaxHeartRate(){
        // max heartrate in bpm = 220 - age in years.
        return 220 - getAge();
    }
    // calculate and return target heartrate
    public String getTargetHeartRate(){
        return String.format("%.0f - %.0f",
                getMaxHeartRate() * 0.5, getMaxHeartRate() * 0.85);
    }
}