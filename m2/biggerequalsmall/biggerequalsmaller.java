import java.util.Scanner;
public class biggerequalsmaller
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int varA = sc.nextInt();
		int varB = sc.nextInt();
		if (varA > varB)
		{
			System.out.println("Bigger");
		}
		else if (varA < varB)
		{
			System.out.println("Smaller");
		}
		else
		{
			System.out.println("equal");
		}
	}

}