package company;

interface Camera_59{
    void takeSnap();
    void recordVideo();

    private void greet(){
        System.out.println("Hello Good Morning");
    }
    default void record4kVideo(){
        greet();
        System.out.println("Recording 4k Video");
    }
}

interface Wifi_59{
    String[] getNetworks();
    void connectToNetworks(String network);

}

class CellPhone_59{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone_59 extends CellPhone_59 implements Camera_59, Wifi_59{

    public void takeSnap(){
        System.out.println("Taking Snap... ");

    }

    public void recordVideo(){
        System.out.println("Recording The Video... ");

    }
//    public void record4kVideo(){
//        System.out.println("Recording The 4k Video... ");
//
//    }

    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networksList = {"Airtel", "Jio", "Vodafone"};
        return networksList;
    }

    public void connectToNetworks(String network){
        System.out.println("Connect to " + network);
    }
}

public class CWH_59_polymorphism {
    public static void main(String[] args) {

        Camera_59 cam1 = new MySmartPhone_59(); //This is a smartphone but please use it as a camera
        cam1.takeSnap();

        MySmartPhone_59 sm = new MySmartPhone_59(); // You can use all the methods
        sm.record4kVideo();
        sm.connectToNetworks("Jio");
        sm.takeSnap();
        sm.pickCall();
        sm.callNumber(989898988);

    }
}