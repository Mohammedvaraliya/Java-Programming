package company;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }

    public void vibrate(){
        System.out.println("Vibrating<><><><>");
    }

    public void callFriend(){
        System.out.println("Calling your friend Mevad...");
    }
}

class Square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}

class Rectangle{
    int length,breadth;

    public void set(int l, int b){
        length = l;
        breadth = b;
    }

    public int area(){
        return length*breadth;
    }

    public int perimeter(){
        return 2*(length+breadth);
    }
}

class TommyVercetti{
    public void hit(){
        System.out.println("Hitting the enemy");
    }

    public void run(){
        System.out.println("Running from the enemy");
    }

    public void fire(){
        System.out.println("Firing on the enemy");
    }
}

class Circle{
    int radius;

    public void set(int r){
        radius = r;
    }

    public double area(){
        return (3.17)*radius*radius;
    }

    public double circumference(){
        return 2*(3.17)*radius;
    }
}


public class CWH_39_ch8_ps {
    public static void main(String[] args) {
        /*
        // Problem 1
        com.Employee vara = new com.Employee();
        vara.setName("Varaliya Mohammed");
        System.out.println(vara.getName());
        vara.salary = 99000;
        System.out.println(vara.getSalary());

        // Problem 2
        com.CellPhone cel = new com.CellPhone();
        cel.ring();
        cel.vibrate();
        cel.callFriend();

        // Problem 3
        com.Square sq = new com.Square();
        sq.side = 6;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());

        // Problem 4
        com.Rectangle rect = new com.Rectangle();
        rect.set(4,3);
        System.out.println("Area of com.Rectangle is : "+ rect.area());
        System.out.println("Perimeter of com.Rectangle is : "+ rect.perimeter());

        // Problem 5
        com.TommyVercetti player1 = new com.TommyVercetti();
        player1.hit();
        player1.run();
        player1.fire();
         */

        // Problem 6
        Circle c1 = new Circle();
        c1.set(7);
        System.out.println("Are of circle is : "+ c1.area());
        System.out.println("Perimeter of circle is : "+ c1.circumference());






    }
}
