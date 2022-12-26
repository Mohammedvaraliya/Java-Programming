package company;

public class CWH_31_methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z = x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 5;
        int b = 7;
        int c;
        // Method invocation using object creation
        ///com.CWH_31_methods obj = new com.CWH_31_methods();
        // c = obj.logic(5,7);
        c = logic(a,b);
        System.out.println(c);

    }
}
