package company;

import org.w3c.dom.css.Counter;

import java.util.Scanner;

class Game1{
    int userNumber;
    int compNumber;
    int counter = 0;

    public Game1(){
        compNumber = (int)(Math.random()*100);
        System.out.println(compNumber);
    }

    public void setUserNumber(int n){
        this.userNumber = n;
    }

    public int isCorrect(){
        if (userNumber > compNumber ){
            return -1;
        }
        else if (userNumber < compNumber) {
            return 1;
        }
        else {
            return 0;
        }
    }

    public void Counter(){
        counter++;
    }
}

public class CWH_50_ex3_sol {
    public static void main(String[] args) {

        Game1 game = new Game1();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        while (true) {
            System.out.print("Enter a number between 1-100 : ");
            n = sc.nextInt();
            game.setUserNumber(n);

            if (game.isCorrect() == 0) {
                game.Counter();
                System.out.println("Congratulations, You've guessed the number");
                System.out.println("Number of counts: " + (game.counter));
                if(game.counter == 1){
                    System.out.println("Too good! You earned an award");
                }
                break;

            }

            else if (game.isCorrect() == -1) {
                game.Counter();
                System.out.println("Lower Number Please! ");
            }

            else if (game.isCorrect() == 1) {
                game.Counter();
                System.out.println("Higher Number Please! ");
            }
        }
    }
}
