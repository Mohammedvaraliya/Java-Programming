package company;

class Employee1{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is : "+ id);
        System.out.println("And my name is : "+ name);
    }

    public int getSalary(){
        return salary;
    }
}

public class CWH_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our Custom Class");

        Employee1 vara = new Employee1(); // Instantiating a new com.Employee Object
        Employee1 shubham = new Employee1();

        // Setting Attributes for vara
        vara.id = 103;
        vara.salary = 34;
        vara.name = "varaliya Mohammed";

        // Setting Attributes for shubham
        shubham.id = 104;
        shubham.salary = 35;
        shubham.name = "Shubham Thakur";

        // Printing the Attributes
        // System.out.println(vara.id);
        // System.out.println(vara.name);
        vara.printDetails();
        shubham.printDetails();
        System.out.println(vara.getSalary()+" Thousand");
        System.out.println(shubham.getSalary()+" Thousand");
    }
}