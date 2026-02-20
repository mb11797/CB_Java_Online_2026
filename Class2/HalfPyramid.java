
/*

*  			line = 1
* * 		line = 2
* * * 		line = 3
* * * * 	...
* * * * * 

*/

public class HalfPyramid {
	public static void main(String[] args){

		// System.out.println("*");
		// System.out.println("**");
		// System.out.println("***");
		// System.out.println("****");
		// System.out.println("*****");

		// All 3 are same things:
		// line = line + 1 
		// line += 1
		// line++ 
		// ++line

		for(int line=1; line<=5; line=line+1){		// line += 1
			// we will come inside this loop for 5 times to run all the statements written in this loop
			// TODO: some work
			for(int star=1; star<=line; star=star+1){		// print stars horizontally of a respective line no
				System.out.print("*");		// 5 times
			}
			System.out.println();			// for printing a new line after printing stars of a line
		}
	}
}


