import javax.swing.JOptionPane;
public class THRCAL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = JOptionPane.showInputDialog("who wants to use this program please?"); 
		String message = String.format("welcom %s to the Target heart-rate calculator program",name);
		JOptionPane.showMessageDialog (null,message);
		    String Fn = JOptionPane.showInputDialog("please enter your first name");
		    String Ln = JOptionPane.showInputDialog("please enter your last name");
		    String dateb1 = JOptionPane.showInputDialog("please enter your date of birth name\n\nDAY:");
		    String dateb2 = JOptionPane.showInputDialog("please enter your date of birth name\n\nMONTH:");
		    String dateb3 = JOptionPane.showInputDialog("please enter your date of birth name\n\nYEAR:");
		    int d1 = Integer.parseInt(dateb1);
		    int d3 = Integer.parseInt(dateb3);


		HeartRates heartrate1 = new HeartRates(Fn,Ln);
		heartr
		ate1.getDB(int dateb1,int dateb2,int dateb3);
		heartrate1.setDB();
		system.out.println("analysing your Case...");
		heartrate1.MHR();
		heartrate1.THR();

	}

}
