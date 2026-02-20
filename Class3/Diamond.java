import java.util.Scanner;

/*

Diamond: 

          *    
        *   * 
      *   *   * 
    *   *   *   * 
  *   *   *   *   * 
    *   *   *   * 
      *   *   * 
        *   * 
          * 

*/

public class Diamond{

  public static void printEquilateralTriangle(int n){
    for(int line=1; line<=n; line++){
      // ToDo: Print (n-line) Spaces
      for(int space=1; space<=n-line; space++){
        System.out.print(" ");
      }

      // ToDo: Print 'line' no of Stars
      for(int star=1; star<=line; star++){
        System.out.print("* ");
      }

      // ToDo: Print new line
      System.out.println();
    }
  }

  public static void printFlippedEquilateralTriangle(int n){
    for(int line=1; line<=n; line++){
      // Extra Space needed for Diamond Pattern
      System.out.print(" ");

      // ToDo: Print (line-1) Spaces
      for(int space=1; space<=line-1; space++){
        System.out.print(" ");
      }

      // ToDo: Print 'n - line + 1' no of Stars
      for(int star=1; star<=n - line + 1; star++){
        System.out.print("* ");
      }

      // ToDo: Print new line
      System.out.println();
    }
  }

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    printEquilateralTriangle(n);
    printFlippedEquilateralTriangle(n-1);

  }
}