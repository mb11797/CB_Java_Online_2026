import java.util.Scanner;

public class Arrays2D{

	public static void print2DArray(int[][] arr){
		int nRows = arr.length;		// Rows
		int nCols = arr[0].length;	// Columns

		// Print row wise
		for(int row=0; row<nRows; row++){
			for(int col=0; col<nCols; col++){
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[] search(int[][] arr, int target){
		for(int row=0; row<arr.length; row++){
			for(int col=0; col<arr[0].length; col++){
				if(arr[row][col] == target){
					return new int[]{row, col};
				}
			}
		}

		return new int[]{-1, -1};
	}

	public static void main(String[] args){
		// int[][] arr2D = new int[2][3];

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no of Rows and Columns: ");
		int nRows = scanner.nextInt();
		int nCols = scanner.nextInt();

		int[][] arr2D = new int[nRows][nCols];

		System.out.println("Enter 2D Array Elements: ");		
		for(int row=0; row<nRows; row++){
			for(int col=0; col<nCols; col++){
				arr2D[row][col] = scanner.nextInt();
			}
		}

		System.out.println("Prinitng 2D Array: ");
		print2DArray(arr2D);

		System.out.println("Enter the element to search: ");
		int target = scanner.nextInt();

		System.out.println("Searching in 2D Array...");

		int[] ans = search(arr2D, target);
		if(ans[0] == -1 && ans[1] == -1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at (" + ans[0] + ", " + ans[1] + ")");
		}

	}
}