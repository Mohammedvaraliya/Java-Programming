package company;

public class CWH_17_Logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND....");
        boolean a = true;
        boolean b = false;
        boolean c = true;

        if (a && b && c){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical OR....");

        if (a || b){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        System.out.println("For Logical Not....");
        System.out.print("logial(a) is ");
        System.out.println(!a);
        System.out.print("logial(b) is ");
        System.out.println(!b);

    }
}
