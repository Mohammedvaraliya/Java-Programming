package company;

public class CWH_21_Ch5_Loops {
    public static void main(String[] args) {
        System.out.println("Using Loops");
        int i = 100;
        while (i<=200){
            System.out.println(i);
            i++;
        }
        System.out.println("Finish Running While Loop");

        // Infinite while loop
        while (true){
            System.out.println("I am an infinite while loop");
        }
    }
}
