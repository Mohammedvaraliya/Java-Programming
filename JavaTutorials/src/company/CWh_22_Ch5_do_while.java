package company;

import java.util.Scanner;

public class CWh_22_Ch5_do_while {
    public static void main(String[] args) {
//        int a = 0;
//        while (a < 5){
//            System.out.println(a);
//            a++;
//        }

//        do while loop
//        int b = 0;
//        do{
//            System.out.println(b);
//            b++;
//        }
//        while (b<=10);

//        do while loop with user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int c = sc.nextInt();
        int i = 1;
        do{
            System.out.println(i);
            i++;
        }
        while (i<=c);


    }
}
