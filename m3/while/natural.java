import java.util.Scanner;
final class natural() {
	private native() { }
	public static void main(final String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int sum = 0
		for(int i = 0; i<=num;i++) {
			sum = sum + 1;
		}
		System.out.println(sum);
	}
}