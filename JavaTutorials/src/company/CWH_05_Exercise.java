package company;

import java.util.Scanner;

public class CWH_05_Exercise {
    public static void main(String[] args) {
        System.out.println("Calculating The CBSE BOARD Subjects Percentage");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Marks Of Mathematics : ");
        int math = sc.nextInt();
        System.out.print("Enter The Marks Of E.V.S : ");
        int evs = sc.nextInt();
        System.out.print("Enter The Marks Of English : ");
        int english = sc.nextInt();
        System.out.print("Enter The Marks Of Hindi : ");
        int hindi = sc.nextInt();
        System.out.print("Enter The Marks Of Social Science : ");
        int socialScience = sc.nextInt();
        System.out.print("The Sum Of These Subjects is : ");
        int sum = (math + evs + english + hindi + socialScience);
        System.out.println(sum);
        float percentage = ((sum) / 500.0f) * 100;
        System.out.print("Percentage is : ");
        System.out.println(percentage);
    }

}
