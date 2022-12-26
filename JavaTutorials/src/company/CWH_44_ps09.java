package company;

class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height){
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2* Math.PI* radius * height;
    }

    public double volume(){
        return Math.PI* radius * radius * height;
    }
}

class Rectangle1{
    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class CWH_44_ps09 {
    public static void main(String[] args) {

        /*
        // Problem 1
        com.Cylinder myCylinder = new com.Cylinder();
        myCylinder.setHeight(15);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(7);
        int r = myCylinder.getRadius();
        System.out.println(r);

        // Problem 2
        com.Cylinder myCylinder = new com.Cylinder();
        myCylinder.setHeight(15);
        int h = myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadius(7);
        int r = myCylinder.getRadius();
        System.out.println(r);
        System.out.println("The surfaceare is : "+myCylinder.surfaceArea());
        System.out.println("The Volume is : "+myCylinder.volume());

        // Problem 3
        com.Cylinder c1 = new com.Cylinder(5,10);
        System.out.println(c1.getRadius());
        System.out.println(c1.getHeight());
         */

        // Problem 4
        Rectangle1 r1 = new Rectangle1();
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

        Rectangle1 r2 = new Rectangle1(10,20);
        System.out.println(r2.getLength());
        System.out.println(r2.getBreadth());

    }
}
