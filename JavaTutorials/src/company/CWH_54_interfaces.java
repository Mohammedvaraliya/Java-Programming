package company;

interface Bikes{
    void Honda(int price);
    void BMW(int price, int year);
}

class ModernBikes implements Bikes{
    int price,year;
    public void Honda(int price){
        System.out.println("This Honda Bike Price is "+ price);
    }

    public void BMW(int price, int year){
        System.out.printf("This BMW Bike Price is %d and year is %d", price, year);

    }
}


public class CWH_54_interfaces {
    public static void main(String[] args) {

        ModernBikes mod = new ModernBikes();
        mod.Honda(90000);
        mod.BMW(500000, 2017);


    }
}
