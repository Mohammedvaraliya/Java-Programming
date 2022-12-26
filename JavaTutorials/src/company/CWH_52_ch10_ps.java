package company;

class Circle_61{

    public int radius;

    Circle_61(){
        System.out.println("I am non parametrized constructor");
    }

    Circle_61(int r){
        this.radius = r;
        System.out.println("I am circles Parametrized constructor");
    }

    public double area(){
        return Math.PI*this.radius * this.radius;
    }

}

class Cylinder_61 extends Circle_61{
    public int height;
    Cylinder_61(int r, int h){
        super(r);
        this.height = h;
        System.out.println("I am cylinder parametrized constructor");

    }

    public double volume(){
        return Math.PI*this.radius * this.radius * this.height;
    }

}

class Rectangle_61{
    private float width, breadth;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float height) {
        this.breadth = height;
    }

    public float area(){
        return width*breadth;
    }
}

class Cuboid_61 extends Rectangle_61{
    private float height;

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return height;
    }

    public float volume (){
        return area()*height;
    }

}

public class CWH_52_ch10_ps {
    public static void main(String[] args) {
        /*
        // Problem 1
        Circle_61 objc = new Circle_61(12);
        System.out.println(objc.area());

        Cylinder_61 obj = new Cylinder_61(12,4);
        System.out.println(obj.volume());
         */

        // Problem 2
        Rectangle_61 rec = new Rectangle_61();
        rec.setWidth(10.5f);
        rec.setBreadth(6.5f);
        System.out.println("The width of rectangle is : " + rec.getWidth());
        System.out.println("The breadth of rectangle is : " + rec.getBreadth());
        System.out.println("The are af rectangle is : " + rec.area());
        Cuboid_61 cub = new Cuboid_61();
        cub.setHeight(9.7f);
        cub.setBreadth(6.5f);
        cub.setWidth(9.6f);
        System.out.println("The width of rectangle is : " + cub.getWidth());
        System.out.println("The breadth of rectangle is : " + cub.getBreadth());
        System.out.println("The volume of cuboid is : " + cub.volume());





    }
}
