import java.util.Scanner;

/*

Flipped Hollow Equilateral Triangle: 

* * * * *   l = 5 -> space = 0 
 *     *    l = 4 -> space = 1
  *   *     l = 3 -> space = 2
   * *      l = 2 -> space = 3
    *       l = 1 -> space = 4

*/

public class FlippedHollowEquilateralTriangle{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    for(int line=n; line>=1; line--){
      // ToDo: Print (line-1) spaces
      for(int space=1; space<=n-line; space++){
        System.out.print(" ");
      }

      if(line == 1 || line == n){
        // enter this if block for line = 1 and line = 5
        for(int star=1; star<=line; star++){
          System.out.print("* ");
        }
      }
      else{
        // enter this else block for line = 2,3,4
        System.out.print("*");

        for(int space=1; space<=2*(line-1)-1; space++){
          System.out.print(" ");
        }

        System.out.print("*");
      }

      // ToDo: Print new line
      System.out.println();
    }

  }
}