package company;

class c1_66{
    public int x = 5;
    protected int y = 10;
    int z = 20;
    private int a = 80;

    public void math1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

class c2_66{

}

public class CWH_66_access_modifiers {
    public static void main(String[] args) {

        c1_66 c = new c1_66();
        c.math1();
//        System.out.println(c.x);
//        System.out.println(c.y);
//        System.out.println(c.z);
        // System.out.println(c.a); --it will throw error as it is private

    }
}
