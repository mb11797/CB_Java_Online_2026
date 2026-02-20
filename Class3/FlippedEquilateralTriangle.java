import java.util.Scanner;

/*

Flipped Equilateral Triangle: 

*   *   *   *   *         
  *   *   *   *            
    *   *   *                
      *   *                    
        *         
*/

public class FlippedEquilateralTriangle{
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();

    for(int line=1; line<=n; line++){
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
}