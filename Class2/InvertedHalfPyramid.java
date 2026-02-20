
/*

* * * * *  
* * * * 
* * * 
* * 
* 

*/

public class InvertedHalfPyramid {
	public static void main(String[] args){

		/*
		// Method 1
		for(int line=1; line<=5; line++){
			for(int star=5; star>=line; star--){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/*
		// Method 2
		for(int i=5; i>=1; i--){
			for(int star=1; star<=i; star++){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		// Method 3
		for(int line=1; line<=5; line++){
			for(int star=1; star <= 5-line+1; star++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}







