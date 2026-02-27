import java.util.Scanner;

public class SecondLargestElement{

	public static int findSecondLargestInArray(int[] arr){
		int maxm = arr[0];
		int secondMaxm = -1;

		for(int i=1; i<arr.length; i++){
			if(arr[i] > maxm){
				secondMaxm = maxm;
				maxm = arr[i];
			}
			else if(arr[i] > secondMaxm){
				secondMaxm = arr[i];
			}
		}

		return secondMaxm;
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];

		for(int i=0; i<n; i++)
			arr[i] = scanner.nextInt();

		System.out.println(findSecondLargestInArray(arr));
	}
}