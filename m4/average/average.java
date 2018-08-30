import java.util.*;
public class average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int[] arr = new int[size];
		for (int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int average = 0;
		int sum =0;
		for (int j =0;j<arr.length;j++){
			sum = sum + arr[j];
		}
		average = sum / arr.length;
		System.out.println("average = "+average);
	}
}