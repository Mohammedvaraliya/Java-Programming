package company;

public class CWH_24_break_and_continue {
    public static void main(String[] args) {
        //Break and continue
//        for loop break
//        for(int i=0; i<5; i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Break");
//                break;
//            }
//        }

//        While loop break
//        int i = 0;
//        while(i<10){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Break");
//                break;
//            }
//            i++;
//        }


//        do while loop break
//        int i = 0;
//        do {
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Break");
//                break;
//            }
//            i++;
//        }
//        while(i<10);
//            System.out.println("Loops Ends Here!");



            //Break and continue
//        for loop break
//        for(int i=0; i<5; i++){
//            if(i==2){
//                System.out.println("Continue Loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//        }

//        While loop break
//        int i = 0;
//        while(i<10){
//            i++;
//            if(i==2){
//                System.out.println("Continue while loop");
//                continue;
//            }
//            System.out.println(i);
//            System.out.println("java is great");
//
//        }
//
//
////        do while loop break
        int i = 0;
        do {
            i++;
            if(i==2){
                System.out.println("continue do while loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
        while(i<10);
            System.out.println("Loops Ends Here!");
    }

}
