import java.util.Scanner;

/*

Input:
4 6 2 10 22 37 28 8 98 1 

*/


public class ArrayOperations{

	public static void printArray(int[] arr){
		int n = arr.length;
		// Print the array elements
		System.out.println("Printing the Array: ");
		for(int i=0; i<n; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void reversePrintArray(int[] arr){
		int n = arr.length;
		System.out.println("Reverse Printing the Array: ");
		for(int i=n-1; i>=0; i--){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static int findLargestInArray(int[] arr){
		int maxm = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] > maxm){
				maxm = arr[i];
			}
		}
		return maxm;
	}

	public static int findSmallestInArray(int[] arr){
		int minm = arr[0];
		for(int i=1; i<arr.length; i++){
			if(arr[i] < minm){
				minm = arr[i];
			}
		}
		return minm;
	}

	public static int searchInArray(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key)
				return i;
		}
		return -1;
	}

	public static void searchInArrayWithDuplicates(int[] arr, int key){
		for(int i=0; i<arr.length; i++){
			if(arr[i] == key){
				System.out.println(key + " is present at idx = " + i);
			}
		}
	}

	public static void main(String[] args){
		// int valuePassedFromTerminal = Integer.parseInt(args[0]);
		// System.out.println("valuePassedFromTerminal = " + valuePassedFromTerminal);

		// System.out.println("Values Passed From Terminal: " );
		// for(String s: args){
		// 	System.out.print(s + " ");
		// }
		// System.out.println();

		// int n = Integer.parseInt(args[0]);
		// System.out.println("n (passed from terminal) = " + n);

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];	// Declaration + Memory Assignment

		System.out.println("Size of Array = " + arr.length);

		// Input the array elements by user
		for(int i=0; i<n; i++){
			arr[i] = scanner.nextInt();
		}

		System.out.println(arr[4]);

		printArray(arr);
		reversePrintArray(arr);	

		System.out.println("Largest / Maximum in Array: " + findLargestInArray(arr));
		System.out.println("Smallest / Minimum in Array: " + findSmallestInArray(arr));

		int key = 3;
		int ansIdx = searchInArray(arr, key);
		if(ansIdx != -1){
			System.out.println(key + " is present at index = " + ansIdx);
		}
		else{
			System.out.println(key + " is not present");
		}

		searchInArrayWithDuplicates(arr, key);

	}
}

