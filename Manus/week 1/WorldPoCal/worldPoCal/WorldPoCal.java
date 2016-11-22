package worldPoCal;
public class WorldPoCal 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float pi=(float) 20000;
		float an_rate=200;
		System.out.println("The present population of the world is "+pi+"\n and the anual population growth rate is "+an_rate+ "per thousand ");
		
		System.out.println("\nThe world's population a year from now is "+(((an_rate/1000)*pi)+pi)+"");
	    pi = (((an_rate/1000)*pi)+pi);
	    System.out.println("\nThe world's population two years from now is "+(((an_rate/1000)*pi)+pi)+"");
		pi = (((an_rate/1000)*pi)+pi);
		System.out.println("\nThe world's population three years from now is "+(((an_rate/1000)*pi)+pi)+"");
		pi = (((an_rate/1000)*pi)+pi);
		System.out.println("\nThe world's population four years from now is "+(((an_rate/1000)*pi)+pi)+"");
		pi = (((an_rate/1000)*pi)+pi);
		System.out .println("\nThe world's population five years from now is "+(((an_rate/1000)*pi)+pi)+"");
	}//End of main method.

}
