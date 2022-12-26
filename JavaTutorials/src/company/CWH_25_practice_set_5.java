package company;

import java.util.Scanner;

public class CWH_25_practice_set_5 {
    public static void main(String[] args) {
        // practice Problem 1
//        int n = 4;
//        for (int i=n; i>0; i--){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");
//        }

        // Practice Problem 2
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            sum += 2*i;
        }
        System.out.println("Sum of even number is: ");
        System.out.println(sum);
        // First 4 even numbers are - 0 2 4 6

        // Practice Problem 3
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 4
//        int n = 10;
//        for(int i=10;i>=1;i--){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }

        // Practice Problem 5
//        int n = 5;
//        // what is factorial n = n * n-1 * n-2 .... 1
//        // 5! = 5*4*3*2*1
//        int i = 1;
//        int factorial = 1;
//        for (i = 1; i<=n; i++){
//            factorial *= i;
//            System.out.println(factorial);
//
//        }

        //Practice Problem 6
//        int n = 5;
//        // what is factorial n = n * n-1 * n-2 .... 1
//        // 5! = 5*4*3*2*1
//        int i = 1;
//        int factorial = 1;
//        while (i<=n){
//            factorial *= i;
//            i++;
//        }
//        System.out.println(factorial);

        // practice Problem 7
//        int i=4;
//        while(i>=0){
//            int j=i;
//            while(j>0){
//                System.out.print("*");
//                j--;
//            }
//            System.out.println();
//            i--;
//        }

        // Practice Problem 9
//        int n = 8;
//        int sum = 0;
//        for(int i=1;i<=2;i++){
//            sum += n*i;
//        }
//        System.out.println(sum);

        // Practice Problem 11
//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int i = 0;
//        int n = sc.nextInt();
//        while(i<=n){
//            sum = sum + (2*i);
//            i++;
//        }
//        System.out.println("Sum of even number is: ");
//        System.out.println(sum);
//        // First 4 even numbers are - 0 2 4 6 8 10 12 14 16 18


    }
}
