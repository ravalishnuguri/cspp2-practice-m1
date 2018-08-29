import java.util.Scanner;
final class natural {
	private natural() { }
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0;
		for(int i = 0; i<=num;i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}