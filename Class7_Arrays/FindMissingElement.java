import java.util.Scanner;

public class FindMissingElement{

	public static int findMissingElement(int[] arr){
		int N = arr.length;
		int n = N+1;

		int expectedSum = (n * (n+1)) / 2;
		int actualSum = 0;
		for(int i=0; i<N; i++)
			actualSum += arr[i];

		// int missingElement = expectedSum - actualSum;
		// return missingElement;

		return expectedSum - actualSum;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = scanner.nextInt();

		System.out.println("Missing Element: " + findMissingElement(arr));
	}
}