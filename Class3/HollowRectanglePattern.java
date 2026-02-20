import java.util.Scanner;

/*
Hollow Rectangle: 

* * * * *  
*       * 
*       * 
*       * 
* * * * * 

*/

public class HollowRectanglePattern {
	public static void main(String[] args){

		// Rectangle - m x n
		// m = ?
		// n = ?

		/*
		// Hardcoded the input
		int m = 12;		// width / lines
		int n = 10;		// length
		*/

		// Take input from the user
		Scanner scannerObj = new Scanner(System.in);
		int m = scannerObj.nextInt();
		int n = scannerObj.nextInt();

		for(int line=1; line<=m; line++){
			if(line == 1 || line == m){
				for(int star=1; star<=n; star++){
					System.out.print("*");
				}
				System.out.println();
			}
			else{
				// ToDo: Print 1 Star
				System.out.print("*");

				// ToDo: Print (n-2) Spaces
				for(int space=1; space<=n-2; space++){
					System.out.print(" ");
				}
				
				// ToDo: Print 1 Star
				System.out.print("*");
				
				// ToDo: Print New Line
				System.out.println();
			}
		}
	}
}
