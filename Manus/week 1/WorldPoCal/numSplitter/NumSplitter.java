package numSplitter;

import java.util.Scanner;

public class NumSplitter {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in;
		in = new Scanner(System.in);
		int a;
		int a1,a2,a3,a4,a5;
		System.out.println("Enter five digit number:");
		a=in.nextInt();
		a1 = a%10;
		a = (a-a%10)/10;
		a2 = a%10;
		a = (a-a%10)/10;
		a3 = a%10;
		a = (a-a%10)/10;
		a4 = a%10;
		a = (a-a%10)/10;
		a5 = a%10;
		System.out.println(""+a5+"  "+a4+"  "+a3+"  "+a2+"  "+a1+"");
		

	}

}
