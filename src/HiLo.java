import java.util.Scanner;

public class HiLo {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /* Create a random number for the user to guess */
        int theNumber; //= (int)(Math.random() * 100 + 1); //(int) type cast to int
       // System.out.println(theNumber);

        // var for counting tries

        String playAgain = " ";
        do{
            int guess = 0;
            int numberOfTries = 0;
            theNumber = (int)(Math.random() * 100 + 1);
            while(guess != theNumber)
            {
                numberOfTries ++;
                System.out.println("Guess an number between 1 and 100: ");
                guess = scan.nextInt();
                System.out.println("You entered " + guess + " .");
                if(guess < theNumber)
                {
                    System.out.println(guess +" is too low. Try again. ");
                }
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again." );
                else
                    System.out.println(guess + " is correct. You win! \n" + "It only took " + numberOfTries + " tries !" );

            }// end of while loop for guessing
            System.out.println("Would you like to play again (y/n)?");
            playAgain = scan.next();
        } while(playAgain.equalsIgnoreCase("y"));
        System.out.println("Thank you for playing! Goodbye :)");
        scan.close(); // close resource leaks
    }
}
