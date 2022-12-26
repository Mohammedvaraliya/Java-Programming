package company;

interface Camera_57{
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

interface Wifi_57{
    String[] getNetworks();
    void connectToNetworks(String network);

}

class CellPhone_57{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class MySmartPhone_57 extends CellPhone_57 implements Camera_57, Wifi_57{

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

public class CWH_57_default_methods {
    public static void main(String[] args) {

        MySmartPhone_57 sm  = new MySmartPhone_57();
        sm.takeSnap();
        sm.recordVideo();
        sm.record4kVideo();
        sm.connectToNetworks("Airtel");
        sm.record4kVideo();
        //sm.greet(); -- Throws an Error

        // To print all the Networks from Mysmartphone_57 class
        String[] arr = sm.getNetworks();
        for (String element: arr) {
            System.out.println(element);
        }
//        for(int i = 0; i<arr.length; i++){
//            System.out.println(arr[i]);
//        }

    }
}
