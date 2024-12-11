import java.util.Scanner;
class w45 
{
	public static void main(String[] args) 
	{
		//System.out.println("input");
		Scanner text=new Scanner(System.in);
		String x;
		
		x=text.next();
		switch (x)
		{
		case "A":
			System.out.println("C5");
		break;
		case "B":
			System.out.println("C3");
		break;
		default:
			System.out.println("No Case");
		break;
		}
	}
}
