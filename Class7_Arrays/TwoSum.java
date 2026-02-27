import java.util.Scanner;

public class TwoSum{

	public static void findTargetSumOf2Elements(int[] arr, int targetSum){
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == targetSum){
					System.out.println(i + ", " + j);
					return;
				}
			}
		}
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = scanner.nextInt();

		int targetSum = scanner.nextInt();

		findTargetSumOf2Elements(arr, targetSum);
	}
}