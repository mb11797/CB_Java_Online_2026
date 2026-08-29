import java.util.*;

public class MergeSort{

	public static void printArr(int[] arr, int beg, int end){
		System.out.println("Printing from " + beg + " to " + end + ": ");		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");			
		}
		System.out.println();
	}

	private static void merge(int[] arr, int beg, int end){
		// merge 2 sorted arrays
		int mid = (beg + end) / 2;
		int i = beg;
		int j = mid+1;

		int[] sortedArr = new int[end - beg + 1];
		int k = 0;		// k -> to iterate on sortedArr

		while(i <= mid && j <= end){
			if(arr[i] < arr[j]){
				sortedArr[k++] = arr[i++];
			}
			else{
				sortedArr[k++] = arr[j++];
			}
		}

		while(i <= mid){
			sortedArr[k++] = arr[i++];
		}

		while(j <= end){
			sortedArr[k++] = arr[j++];
		}

		k = 0;
		for(i=beg; i<=end; i++){
			arr[i] = sortedArr[k++];
		}
	}

	private static void mergeSort(int[] arr, int beg, int end){
		if(beg >= end){
			return;
		}

		int mid = (beg + end) / 2;
		mergeSort(arr, beg, mid);
		mergeSort(arr, mid+1, end);

		merge(arr, beg, end);
		// printArr(arr, beg, end);
	}

	public static void mergeSort(int[] arr){
		mergeSort(arr, 0, arr.length-1);
		printArr(arr, 0, arr.length-1);
	}

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();

		int[] arr = new int[n];
		for(int i=0; i<n; i++){
			arr[i] = scanner.nextInt();
		}

		mergeSort(arr);
	}
}