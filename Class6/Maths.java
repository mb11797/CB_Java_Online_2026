import java.util.Scanner;

public class Maths{

	public static int countDigits(int n){
		// for all cases where n != 0
		int count = 0;
		while(n > 0){
			// System.out.println("n = " + n + " : count = " + count);
			n = n / 10;
			count++;
		}
		return count;
	}

	public static int reverseDigits(int n){
		int reverseNo = 0;
		while(n > 0){
			int remainder = n % 10;
			reverseNo = reverseNo * 10 + remainder;
			n = n / 10;
		}
		return reverseNo;
	}

	public static boolean isPrime(int n){
		for(int i=2; i<=n-1; i++){
			if((n % i) == 0){
				return false;
			}
		}

		return true;
	}

	public static boolean isPalindrome(int n){
		int reverseNo = reverseDigits(n);
		if(n == reverseNo){
			return true;
		}
		return false;
	}

	/*
	public class Student{
		String name;
		int marks;
		int age;
		int rollNo;
	}

	public static Student getStudentInfo(int rollNo){
		Student s = new Student("Madhu", 100, 22, 56);
		return s;
	}
	*/

	public static boolean isPowerOf3(int n){
		while(n > 1){
			if(n % 3 != 0){
				return false;
			}
			n = n / 3;
		}

		return true;
	}

	public static int squareRoot(int n){
		int possibleSquareRootAns = 0;
		int i = 1;
		while(i * i <= n){
			possibleSquareRootAns = i;
			i++;
		}
		return possibleSquareRootAns;
	}

	public static void main(String[] args){

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		// Method-1
		// int count = countDigits(n);
		// System.out.println("Count of Digits = " + count);

		// Method-2
		System.out.println("Count of Digits = " + countDigits(n));

		System.out.println("Reverse of Digits = " + reverseDigits(n));

		boolean isPrimeNo = isPrime(n);
		if(isPrimeNo == true){
			System.out.println(n + " is a Prime No");
		}
		else{
			System.out.println(n + " is not a Prime No");
		}

		boolean isPalindromeNo = isPalindrome(n);
		if(isPalindromeNo == true){
			System.out.println(n + " is a Palindrome");
		}
		else{
			System.out.println(n + " is not a Palindrome");
		}

		// Student student = getStudentInfo(56);

		boolean isPowerOf3 = isPowerOf3(n);
		if(isPowerOf3 == true){
			System.out.println(n + " is a power of 3");
		}
		else{
			System.out.println(n + " is not a power of 3");
		}

		// int sqrRoot = squareRoot(n);
		// System.out.println("Square root of " + n + " (Floor Value) = " + sqrRoot);

		System.out.println("Square root of " + n + " (Floor Value) = " + squareRoot(n));

		return;	// Empty return statement - NOT MANDATORY
	}
}






