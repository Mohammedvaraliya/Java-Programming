package company;

public class CWH_10_Resulting_Data_Types {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);
        System.out.println(a);

//        Increment And Decrement operator
        int i = 65;
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);

//        Quick Quiz what will be the value of s
        int s = 7;
        int t = ++s*8;
        System.out.println(t);

        char ch = 'a';
        System.out.println(++ch);

    }
}
