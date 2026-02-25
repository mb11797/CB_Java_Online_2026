public class ArraysDS{
	public static void main(String[] args){
		int[] marksArr = new int[5];		// assign 0th index address of a memory block of size = 5 => 0x123 (say)

		// Updating array 
		marksArr[0] = 78;
		marksArr[1] = 89;
		marksArr[2] = 92;
		marksArr[3] = 99;
		marksArr[4] = 65;
		

		System.out.println("Marks of Students: ");
		System.out.println(marksArr[0]);
		System.out.println(marksArr[1]);
		System.out.println(marksArr[2]);
		System.out.println(marksArr[3]);
		System.out.println(marksArr[4]);

		marksArr = new int[100];		// update 0th index address of a memory block of size = 100 => 0x783 (say)

		// NOT A GOOD WAY TO UPDATE MANUALLY
		/*
		marksArr[0] = 78;
		marksArr[1] = 89;
		marksArr[2] = 92;
		marksArr[3] = 99;
		marksArr[4] = 65;
		// ...
		// ...
		marksArr[98] = 99;
		marksArr[99] = 65;
		*/

		for(int i=0; i<100; i++){
			marksArr[i] = i;
		}

		// Printing
		for(int i=0; i<100; i++){
			System.out.println(marksArr[i]);
		}

		// int[] class1 = new 
	}
}