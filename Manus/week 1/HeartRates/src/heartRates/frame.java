package heartRates;
import javax.swing.*;
import java.util.Scanner;
public class frame {
	
	public static void main(String[] args){
		JFrame n =new JFrame("frame");
		
		String a = JOptionPane.showInputDialog(null,"Enter first number:");
		 int b = Integer.parseInt(a);
		 String d = JOptionPane.showInputDialog(null,"Enter second number:");
		 int c = Integer.parseInt(d);
		 int sum = b + c;
		 JOptionPane.showMessageDialog(null,"the answer is :" + sum);
		
		
	}
	

}

