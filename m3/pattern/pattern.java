import java.util.Scanner;
final class pattern {
	private pattern() { }
	public static void main(final String[] args) {
	Scanner s = new Scanner(System.in);
	int num = s.nextInt();
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		System.out.println();
	}
	}
}