import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    
    int base = in.nextInt();

    String stars = "";
    for(int i = 0; i < base; i++){
      stars += "*";
    };

    int noOfStars = stars.length();
    for(int t = noOfStars; t > 0; t--){
      System.out.println(stars);
      stars = stars.substring(0,stars.length()-1);
    };

    in.close();
  }
}
