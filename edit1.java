import java.util.Scanner;
class w43 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("Size = ");

		String glass; 
		
		glass = scanner.nextLine();

		if (glass.equals("S") || glass.equals("s") )
		{
			double water = 8.25*0.75;
			double payglass = 1;
			double sum=water+payglass;
			System.out.println("Pay Glass = "+payglass+"\nPay Water = "+water+"\nPay Sum = "+sum);
		} else if (glass.equals("M") || glass.equals("m"))
		{
			double water = 8.25*1;
			double payglass = 1.5;
			double sum=water+payglass;
			System.out.println("Pay Glass = "+payglass+"\nPay Water = "+water+"\nPay Sum = "+sum);
		} else if (glass.equals("L") || glass.equals("l"))
		{
			double water = 8.25*1.5;
			double payglass = 1.75;
			double sum=water+payglass;
			System.out.println("Pay Glass = "+payglass+"\nPay Water = "+water+"\nPay Sum = "+sum);
		} else if (glass.equals("J") || glass.equals("j"))
		{
			double water = 8.25*2.5;
			double payglass = 2.50;
			double sum=water+payglass;
			System.out.println("Pay Glass = "+payglass+"\nPay Water = "+water+"\nPay Sum = "+sum);
		}
		
	}
}
