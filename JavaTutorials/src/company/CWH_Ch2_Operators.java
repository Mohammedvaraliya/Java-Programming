package company;

public class CWH_Ch2_Operators {
    public static void main(String[] args) {
        int a = 5;
        int b = 8 % a;  // Modulo operator
        System.out.println(b);

        int c = 9;
        c *= 3;
        System.out.println(c);
        System.out.println(a==b); //comparison operator return boolean value
        System.out.println(70>8 && 80>70); //Logical And operator return boolean value
        System.out.println(70<8 || 80>70); //Logical OR operator return boolean value
    }
}
