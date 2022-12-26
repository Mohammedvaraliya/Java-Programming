package company;

import java.util.Scanner;

public class CWh_34_recursion {

    // factorial (0) = 1
    // factorial (n) = n * n-1 * .... 1
    // factorial (5) = 5 * 4 * 3 * 2 * 1
    // factorial (n) = n * factorial(n-1)
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }

    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) { // 1 to n
                product *= i;
            }
            return product;
        }

    }

    // Fibonacci series
    static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int x = 6;
        System.out.println("The value of factorial n using recursion is : " + factorial(x));
        System.out.println("The value of factorial n using iterative is : " + factorial_iterative(x));

        // Fibonacci series
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.printf("fibonacci series of %d is ", num);
            System.out.println(+ fib(i));
        }
    }
}



    // Formula - fib(n-1)+fib(n-2)

