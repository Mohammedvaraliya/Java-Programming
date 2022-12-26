package company;

import java.util.Scanner;
import java.util.Random;

public class CWH_41_Ex2_Sol {
    public static void main(String[] args) {
        /*
        1 for Rock
        2 for paper
        3 for Scissor
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Rock");
        System.out.println("Enter 2 for Paper");
        System.out.println("Enter 3 for Scissor\n");

        System.out.println("The Computer already made it's choice");
        System.out.print("Please make yours : ");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3)+1;

        //computer input
        if (computerInput == 1){
            System.out.println("Computer choice: Rock");
        }
        else if (computerInput == 2) {
            System.out.println("Computer choice: Paper");

        }
        else {
            System.out.println("Computer choice: Scissor");
        }

        // user input
        if (userInput == 1){
            System.out.println("Your choice: Rock");
        }
        else if (userInput == 2) {
            System.out.println("Your choice: Paper");

        }
        else if (userInput == 3) {
            System.out.println("Your choice: Scissor");
        }
        else {
            System.out.println("You have entered Invalid Number");
        }


        if (userInput == computerInput){
            System.out.println("Both choose same!");
            System.out.println("Try Again!");
        }
        else if (userInput == 1 && computerInput == 3
                || userInput == 2 && computerInput == 1
                || userInput == 3 && computerInput == 2){
            System.out.println("You Win!");
            
        }
        else {
            System.out.println("Computer Win!");
        }



    }
}
