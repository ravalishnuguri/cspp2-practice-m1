import java.util.*;
public class firstlast6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int f = 6;
		int[] arr = new int[size];
		for (int i=0;i<arr.length;i++) {
			arr[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		if(arr[0] == f || arr[arr.length-1]==f) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}

	}
}