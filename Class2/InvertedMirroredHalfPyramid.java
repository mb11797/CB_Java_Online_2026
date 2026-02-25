
/*

Inverted Mirrored Half Pyramid 

* * * * * 
  * * * * 
    * * * 
      * * 
        * 

*/

public class InvertedMirroredHalfPyramid {
	public static void main(String[] args){

		for(int line=1; line<=5; line++){
			// ToDo: Print (line-1) spaces
			for(int space=1; space<=line-1; space++){
				System.out.print(" ");				
			}

			// ToDo: Print (5-line+1) stars
			for(int star=1; star<=5-line+1; star++){
				System.out.print("*");				
			}

			// ToDo: Print new line
			System.out.println();
		}
	}
}







