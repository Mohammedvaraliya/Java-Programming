package company;

public class CWH_26_arrays {
    public static void main(String[] args) {
        /*Class of 500 students - You have to store marks of these 500 students

        You have 2 options
        1. Create 500 variables
        2. Use Arrays (recommended)
         */


//        There are three ways to create an array in java
        // way 1
        int [] marks1 = new int[5];
        marks1[0] = 100;
        marks1[1] = 60;
        marks1[2] = 70;
        marks1[3] = 80;
        marks1[4] = 90;
        //marks[5] = 79; -> throws an error coz index out of range
        System.out.println(marks1[4]);

        //way 2
        int [] marks2;
        marks2 = new int[5];
        marks2[0] = 100;
        marks2[1] = 60;
        marks2[2] = 70;
        marks2[3] = 80;
        marks2[4] = 90;
        //marks[5] = 79; -> throws an error coz index out of range
        System.out.println(marks2[4]);

        //way 3
        int [] marks3 = {100,90,80,70,60};
        System.out.println(marks3[2]);

    }
}
