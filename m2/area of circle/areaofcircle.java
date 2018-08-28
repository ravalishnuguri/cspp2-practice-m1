import java.util.Scanner;

public class areaofcircle
 {
 	static double pi()
 	{
 		return 3.14;
 	}
 	static double area(int radious)
 	{
 		double a = pi();
 		return a*radious*radious;
 	}
	public static void main(String[] args)
	 {
		Scanner scan = new Scanner(System.in);
		int rad = scan.nextInt();
		System.out.println(area(rad));

	}
}
