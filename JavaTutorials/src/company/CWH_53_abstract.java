package company;

abstract class Parent_53{
    public Parent_53(){
        System.out.println("I am base_53 default constructor");
    }

    public void sayHello(){
        System.out.println("Hello Everyone");
    }

    abstract public void greet1();
    abstract public void greet2();
}

class Child1_53 extends Parent_53{
    @Override
    public void greet1(){
        System.out.println("Hello Good Morning Everyone");
    }

    @Override
    public void greet2(){
        System.out.println("Hello Good Morning Everyone");
    }
}

class Child2_53 extends Parent_53{
    public void greet1(){
        System.out.println("Hello Good Evening Everyone");
    }
    public void greet2(){
        System.out.println("Hello Good Evening Everyone");
    }
}

abstract class Child3_53 extends Parent_53{
    public void hello(){
        System.out.println("hello");
    }
}

public class CWH_53_abstract {
    public static void main(String[] args) {

//        Parent_53 p = new Parent_53(); -- it will throw Error
        Child2_53 ch2 = new Child2_53();
        ch2.greet1();
        ch2.greet2();

        Parent_53 p = new Child1_53();
        p.greet1();
        p.greet2();

//        Child3_53 ch3 = new Child3_53(); -- It will throw an Error

    }
}
