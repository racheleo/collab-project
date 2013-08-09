import java.util.Scanner;

public class looping
{
   public static void main(String[] args)
   {
      
      final int LOW_VAL = 15;
      final int HIGH_VAL = 1001;
      
      int sum; //holds the answer
      int k; //loop counter
      
      sum = 0; //start off at 0
      for ( k = LOW_VAL; k <= HIGH_VAL; k = k+2);
            {
               sum = sum + k;
            }
      System.out.println("The sum of the odd numbers between " + LOW_VAL +
            " and " + HIGH_VAL + ", inclusive, is " + sum + "\n");
   }
}
