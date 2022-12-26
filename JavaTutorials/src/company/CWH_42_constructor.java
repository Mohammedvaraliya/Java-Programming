package company;

class MyMainEmployee{
    private int id;
    private int salary;
    private String name;

    public MyMainEmployee(){
        this.id = 0;
        this.salary = 0001;
        this.name = "varaliya mohammed";
    }

    public MyMainEmployee(String name){
        this.id = 1;
        this.salary = 002;
        this.name = name;
    }

    public MyMainEmployee(String myName, int myId, int salary){
        this.id = myId;
        this.salary = salary;
        this.name = myName;
    }

    public void setId(int i){
        this.id = i;
    }

    public void setName(String n){
        this.name = n;
    }


    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public int getSalary(){
        return salary;
    }
}

public class CWH_42_constructor {
    public static void main(String[] args) {

        // creating new object of constructor with 0 parameter
        MyMainEmployee vara = new MyMainEmployee();
//        vara.setId(20002);
//        vara.setName("varaliya");
        System.out.println(vara.getId());
        System.out.println(vara.getName());
        System.out.println(vara.getSalary());


        // creating new object of constructor with 1 parameter
        MyMainEmployee vara1 = new MyMainEmployee("varaliyaMohammed1");
        System.out.println(vara1.getId());
        System.out.println(vara1.getName());
        System.out.println(vara1.getSalary());

        // creating new object of constructor with 2 parameter
        MyMainEmployee vara2 = new MyMainEmployee("varaliyaMohammed2",2, 10000);
        System.out.println(vara2.getId());
        System.out.println(vara2.getName());
        System.out.println(vara2.getSalary());
    }
}
