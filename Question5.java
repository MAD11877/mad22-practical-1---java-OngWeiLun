import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    
        List<Integer> allNumbers = new ArrayList<>();

    Scanner in = new Scanner(System.in);

    //System.out.print("Enter integer(reps): ");

    int counter = in.nextInt();

    for(int i = 0; i < counter; i++){
      //System.out.print("Enter integer: ");
      allNumbers.add(in.nextInt());
    }

    in.close();

    int count1 = 0;
    int count2 = 0;
    int mode1 = 0;
    int mode2 = 0;

    for (int m = 0; m < allNumbers.size(); m++){
      
      mode1 = allNumbers.get(m);
      count1 = 0;
      
      for(int j = m + 1; j < allNumbers.size();j++){
        if (mode1 == allNumbers.get(j)) count1++;
      }
      if (count1 > count2){
        mode2 = mode1;
        count2 = count1;
      }  
      
    }

    System.out.print(mode2);
    
  }
}
