package company;

class myEmployee{
    private int id;
    private String name;

    public void setName(String n){
        this.name = n;
    }

    public String getName(){
        return name;
    }

    public void setId(int i){
        this.id = i;
    }

    public int getId(){
        return id;
    }
}

class myCircle{
    private double radius,area,circumference;
    void setRadius(double r){
        radius = r;
    }
    void setArea(double a){
        if (a==(3.14*radius*radius))
            area = a;
        else
            System.out.println("WARNING : Wrong area as per the radius.");
    }
    void setCircumference(double c){
        if (c==(2*3.14*radius))
            circumference=c;
        else
            System.out.println("WARNING : Wrong circumference as per the radius.");
    }
    double getRadius(){
        return radius;
    }
    double getArea(){
        return area;
    }
    double getCircumference(){
        return circumference;
    }
}

public class CWH_40_ch9 {
    public static void main(String[] args) {

        myEmployee vara = new myEmployee();
        //vara.id = 101;
        //vara.name = "varaliya"; --> Throws an error du to private access modifier
        vara.setName("Varaliya Mohammed");
        System.out.println(vara.getName());
        vara.setId(102);
        System.out.println(vara.getId());

        // Object for circle
        myCircle c1 = new myCircle();
        c1.setRadius(3.0);
        c1.setArea(28.259999999999998);
        c1.setCircumference(18.84);
        System.out.println("Area : "+c1.getArea()+" sq. cm");
        System.out.println("Circumference : "+c1.getCircumference()+" cm");
    }
}