package company;

import java.awt.*;
import java.util.Scanner;

public class CWH_19_Ch4_Ps {

    public static void main(String[] args) {
        // Question No 1:
//        int a = 10;
//        if(a = 11){
//
//        }

        // Question No 2:
//        byte m1, m2, m3;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your marks in Physics : ");
//        m1 = sc.nextByte();
//
//        System.out.print("Enter your marks in Chemistry : ");
//        m2 = sc.nextByte();
//
//        System.out.print("Enter your marks in Mathematics : ");
//        m3 = sc.nextByte();
//
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Your Overall percentage is : " + avg);
//        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations, You have been promoted");
//        }
//        else {
//            System.out.println("Sorry, You have not been promoted. Please give exams again!");
//        }

       // Question No 3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your income in lakhs per anum : ");
//        float tax = 0;
//        float income = sc.nextFloat();
//        if(income<=2.5f){
//            tax = tax + 0;
//        }
//        else if(income>2.5f && income<=5f ){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if(income>5f && income<=10f ){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.2f * (income - 5f);
//        }
//        else if(income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.02f * (10.0f - 5f);
//            tax = tax + 0.3f * (income - 2.5f);
//        }
//
//        System.out.println("The total tax paid by the employee is : " + tax);

//        Question No 4
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a day number : ");
//        int day = sc.nextInt();
//        switch (day){
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//                System.out.println("Saturday");
//                break;
//            case 7:
//                System.out.println("Sunday");
//                break;
//        }

//        Question No 5
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter any year:");
//        int year = s.nextInt();
//        boolean flag = false;
//        if(year % 400 == 0)
//        {
//            flag = true;
//        }
//        else if (year % 100 == 0)
//        {
//            flag = false;
//        }
//        else if(year % 4 == 0)
//        {
//            flag = true;
//        }
//        else
//        {
//            flag = false;
//        }
//        if(flag)
//        {
//            System.out.println("Year "+year+" is a Leap Year");
//        }
//        else
//        {
//            System.out.println("Year "+year+" is not a Leap Year");
//        }

        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an Organizational website");
        }
        else if (website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
        else if (website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
    }
}
