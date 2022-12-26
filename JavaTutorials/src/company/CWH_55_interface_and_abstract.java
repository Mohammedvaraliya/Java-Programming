package company;

interface Bicycle{
    int cycles = 10050;
    void applyBreak(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornHONDA365();
    void blowHornDUKE65();
}

class AvonCycle implements Bicycle, HornBicycle{
    public void blowHornHONDA365(){
        System.out.println("peeeeeeee or ppoooooooooo");
    }

    public void blowHornDUKE65(){
        System.out.println("peeeoo zmmmmmmmmmmmmmm");
    }

    public void applyBreak(int decrement){
        System.out.println("Applying Brake " + decrement);
    }

    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }

    void run(){
        System.out.println("hello I am run");
    }
}

public class CWH_55_interface_and_abstract {
    public static void main(String[] args) {

        AvonCycle av = new AvonCycle();
        av.applyBreak(10);
        // You can create properties in interface
        System.out.println(av.cycles);
        // You cannot modify the properties in interfaces as they are final
        // System.out.println(av.cycles = 88);

        av.blowHornDUKE65();
        av.blowHornHONDA365();
        av.run();

    }
}
