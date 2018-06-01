import java.util.Scanner ;

public class WorldPopulationGrowthCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		double currentPop;
		double growthRate;
		double annualPopIncrease;
		double estimatedPop;
		
		System.out.print("Enter population number: ");
		currentPop = input.nextDouble();
		
		System.out.print("Enter population growth rate : ");
		growthRate = input.nextDouble();
		
		annualPopIncrease = (growthRate/100) * currentPop ;
		estimatedPop = annualPopIncrease + currentPop;
		
		System.out.println("Estimated world population after one year is : " + estimatedPop);
		System.out.println("Estimated world population after two years is : " + estimatedPop + (annualPopIncrease*2));
		System.out.println("Estimated world population after three years is : " + estimatedPop + (annualPopIncrease*3));
		System.out.println("Estimated world population after four years is : " + estimatedPop + (annualPopIncrease*4));
		System.out.println("Estimated world population after two years is : " + estimatedPop + (annualPopIncrease*5));
		

	}

}
