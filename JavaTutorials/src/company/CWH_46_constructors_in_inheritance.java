package company;

class Base1{

    Base1(){
        System.out.println("I am a constructor!");
    }

    Base1(int x){
        System.out.println("I am an overloaded constructor with value x : " + x);
    }

}

class Derived1 extends Base1{

    Derived1(){
        //super(0);
        System.out.println("i am a derived class constructor");
    }

    Derived1(int x, int y){
        super(x);
        System.out.printf("I am an overloaded constructor of derived with value of x is %d and y is %d: ", x, y);
        System.out.println();
    }

}

class ChildOfDerived extends Derived1{

    ChildOfDerived(){
        System.out.println("I am a child of Derived constructor");
    }

    ChildOfDerived(int x, int y, int z){
        super(x, y);
        System.out.println("I am an overloaded constructor of child of derived with value of z is : " + z);

    }
}

public class CWH_46_constructors_in_inheritance {
    public static void main(String[] args) {

//        Base1 b = new Base1();
//        Base1 b1 = new Base1(5);

//        Derived1 d = new Derived1(4,8);

        ChildOfDerived child = new ChildOfDerived(2,3,4);



    }
}
