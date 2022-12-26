package company;

class My_Thread_73 extends Thread{

    public My_Thread_73(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println( i + " I am a thread");
            i += 1;
        }
    }

}

class My_Thread2_73 implements Runnable{

    public My_Thread2_73(){
        System.out.println("This is Thread");
    }

    @Override
    public void run(){
        int i = 0;
        while (i < 10){
            System.out.println("Hello i am Thread");
            i += 1;
        }
    }
}

public class CWH_73_Thread_Constructor {
    public static void main(String[] args) {

//        My_Thread_73 t1 = new My_Thread_73("Varaliya");
//        My_Thread_73 t2 = new My_Thread_73("Mohd");
//        t1.start();
//        System.out.println("The id of the thread is " + t1.getId());
//        System.out.println("The name of the thread is " + t1.getName());
//        System.out.println("\n");
//
//        t2.start();
//        System.out.println("The id of the thread is " + t2.getId());
//        System.out.println("The name of the thread is " + t2.getName());

        My_Thread2_73 bullet1 = new My_Thread2_73();
        Thread gun1 = new Thread(bullet1);
        gun1.setName("Varaliya");
        System.out.println(gun1.getName());
        System.out.println(gun1.getId());
        gun1.start();


    }
}
