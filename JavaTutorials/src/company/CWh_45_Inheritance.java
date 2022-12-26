package company;

class Base {
    public int x;

    public void printMe(){
        System.out.println("I am a constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am inn base and setting x now");
        this.x = x;
    }
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class CWh_45_Inheritance {
    public static void main(String[] args) {

        // set x from base class
        Base b = new Base();
        b.setX(6);
        System.out.println(b.getX());

        // set x from derived
        Derived d = new Derived();
        d.setX(9);
        System.out.println(d.getX());
        d.setY(12);
        System.out.println(d.getY());

    }
}
