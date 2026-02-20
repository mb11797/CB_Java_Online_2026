import java.util.Scanner;

/*

Equilateral Triangle: 

          *    
        *   * 
      *   *   * 
    *   *   *   * 
  *   *   *   *   * 

*/

public class EquilateralTriangle{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

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
}