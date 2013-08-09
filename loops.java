import java.util.Scanner;

public class loops
{
   public static void main(String[] args)
   {
      // declare an object that can be used for console input
      Scanner input_stream = new Scanner(System.in);

      // secret value - obfuscate so the programmer doesn't even know it
      final int secret_value = (25 * 9801/35 - 200) / ( 25 + 34/12 );

      // non constant variables
      int guess;
      boolean correct; // loop control

      // welcome message
      System.out.println("Try to guess the secret value ... ");

      // now prepare to loop for the game
      correct = false;  // this gets us into the loop

      // loop as long as we are NOT correct
      while ( !correct )
      {
         System.out.print("Your guess: ");
         guess = input_stream.nextInt();
         if (guess == secret_value)
         {
            // they got it.  wish them well and set loop control variable
            System.out.println("Congratulations!!");
            correct = true;  // this will end the loop next time we test
         }
         
         else if (guess < secret_value)
            System.out.println("Too low.  Guess higher");
         else
            System.out.println("Too high.  Guess lower");
      }
}}