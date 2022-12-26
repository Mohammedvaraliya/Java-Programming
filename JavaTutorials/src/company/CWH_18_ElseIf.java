package company;

import java.util.Scanner;

public class CWH_18_ElseIf {
    public static void main(String[] args) {
        String var = "varaliya";


        switch (var){
            case "varaliya":
                System.out.println("You are goin to become an Adult!");
                break;
            case "shubham":
                System.out.println("You are goin to join a job!");
                break;
            case "nalla":
                System.out.println("You are goin to get retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
        }
        System.out.println("Thanks for using my java code!");


        /*

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();

        if (age>56){
            System.out.println("You are Experienced");
        }
        else if (age>46) {
            System.out.println("You are Semi-Experienced!");
        }
        else if (age>36){
            System.out.println("You are Semi-Semi-Experienced!");
        }
        else {
            System.out.println("You are not Experienced");
        }
        */


    }
}
