package company;

public class CWH_09_Ch2_Op_Pre {
    public static void main(String[] args) {
//        int a = 6*5-34/2;
        //        Precedence & Associativity
        /*
        Both the operators * and / have same presedence so it will goes left to
        right called associativity
            = 30-34/2
            = 30-17
            = 13
         */
//        int b = 60/5-34*2;
        /*
            = 12-34*2
            = 12-68
            = -56
         */
//        System.out.println(a);
//        System.out.println(b);

//        Quick Quiz
//        int x = 12;
//        int y = 1;
//        int k = x * y/2;
//        System.out.println(k);

        int b = 1;
        int c = 4;
        int a = 5;
        int k = b*b - (4*a*c)/(2*a);
        System.out.println(k);
    }
}
