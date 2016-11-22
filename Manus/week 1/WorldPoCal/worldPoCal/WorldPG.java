package worldPoCal;

public class WorldPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int popi = (int)7.5e8;
		double popr = 0.013;
		int p;
		System.out.println("\nYEAR \t POPULATION \t POPULATION INCREASE");
		for(int i=1;i<=75;i++)
		{
			p = (int)((popr*popi)+popi);
			System.out.println(""+i+"\t"+p+"\t"+(int)(popr*popi)+"");
			popi = p;
		}
		System.out.println("\n\nTHE POPULATION OF THE WORLD WILL DOUBLE "+54+" YEARS FROM TODAY");

	}

}
