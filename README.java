import java.util.Scanner;
class w41 
{
	public static void main(String[] args) 
	{
		Scanner price=new Scanner(System.in);
		System.out.print("In Put Price = ");
		double slse,sum;

		int buy=price.nextInt();

		if (buy<1000)
		{
			slse=(buy*0.2)/100;
			sum=buy-slse;
		} else if (buy<3000)
		{
			slse=(buy*0.7)/100;
			sum=buy-slse;
		} else if (buy<5000)
		{
			slse=(buy*1)/100;
			sum=buy-slse;
		} else if (buy<10000)
		{
			slse=(buy*2.5)/100;
			sum=buy-slse;
		} else 
		{
			slse=(buy*5)/100;
			sum=buy-slse;
		}
		System.out.println("Slse  = "+slse);
		System.out.println("Money = "+sum);

	}
}
