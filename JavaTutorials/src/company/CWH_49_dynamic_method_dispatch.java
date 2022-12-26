package company;

class Phone{
    public void showTime(){
        System.out.println("Time is 10:58 PM");
    }
    public void on(){
        System.out.println("Turning on Phone...");
    }
}

class SmartPhone extends Phone{

    public void music(){
        System.out.println("Playing music...");
    }
    public void on(){
        System.out.println("Turning on SmartPhone...");
    }
}

public class CWH_49_dynamic_method_dispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone();
//        SmartPhone sobj = new SmartPhone();
//        obj.name();

//        SmartPhone obj2 = new Phone(); // Not allowed this will throw error
        Phone obj = new SmartPhone(); // allowed it is allowed
        obj.showTime();
        obj.on();
//        obj.music(); //Not allowed

    }
}
