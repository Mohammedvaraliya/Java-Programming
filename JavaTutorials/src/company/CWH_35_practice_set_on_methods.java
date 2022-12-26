package company;

import java.util.Scanner;

public class CWH_35_practice_set_on_methods {

    static void multiplication(int n){
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
    }

    static void patter1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    // sum(n) = 1 + 2 + 3 ... + n
    // sum(n) = 1 + 2 + 3 ... + n-1 + n
    // sum(n) = sum(n-1) + n
    // sum(4) = 4 + sum(3)
    // sum(4) = 4 + 3 + sum(2)
    // sum(4) = 4 + 3 + 2 + sum(1)
    // sum(4) = 4 + 3 + 2 + sum(1)
    // sum(4) = 4 + 3 + 2 + 1 -// 1 which is base condition
    static int sumRec(int n){
        // com.Base condition
        if(n==1){
            return 1;
        }
        else {
            n += sumRec(n-1);
        }
        return n;
    }

    static void patter2(int n){
        for(int i=0; i<n; i++){
            for(int j=n; j>i; j--){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }

    static int fib(int n) {
        if (n == 1 || n ==2)
            return n-1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    static float average(float...arr){
        float total = 0;
        for(float element:arr){
            total += element;
        }
        float avg = total/arr.length;
        return avg;
    }

    static void patter1_rec(int n){
        if (n>0){
            patter1_rec(n-1);
            for(int i=0;i<n;i++){
                System.out.print("*"+" ");
            }
            System.out.println();

        }
    }

    static float fahrenheit(float cel){
        float fahren = (cel * (9/5.0f)) + 32.0f;
        return fahren;
    }

    static int sum_itera(int n){
        int sum = 0;
            for(int i = 1;i<=n;i++){
                sum += i;

            }
            return sum;

    }



    public static void main(String[] args) {

        /*
        // Problem 1
        multiplication(9);

        // Problem 2
        patter1(20);

        // Problem 3
        int c = sumRec(6);
        System.out.println(c);

        // Problem 4
        patter2(5);

        // problem 5 -Fibonacci series
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            System.out.printf("fibonacci series of %d is ", num);
            System.out.println(+ fib(i));
        }

        // Problem 6
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers you want to pass? : ");
        int a = sc.nextInt();
        float [] arr = new float[a];
        for(int i=0; i<a; i++) {
            System.out.print("Enter element " + (i+1) + " : ");
            float el = sc.nextFloat();
            arr[i] = el;
        }
        System.out.println("The Average is : " + average(arr));

        // Problem 8
        patter1_rec(9);

        // Problem 9
        float celcius = 15.7f;
        System.out.println(celcius + " °C" + " -> " + fahrenheit(celcius) + " °F");
         */

        // Problem 10
        int num = 2;
        System.out.println("The sum of first " + num + "th natural numbers is: " + sum_itera(num));





    }
}