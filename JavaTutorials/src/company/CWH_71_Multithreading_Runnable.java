package company;

class MyThread1_71 implements Runnable{
    public void run(){
        int i = 0;
        while(i<100){
            System.out.println("I am Thread 1");
            i +=1;
        }
    }

}

class MyThread2_71 implements Runnable{
    @Override
    public void run(){
        int i = 0;
        while (i<100){
            System.out.println("I am Thread 2");
            i +=1;
        }
    }

}

public class CWH_71_Multithreading_Runnable {
    public static void main(String[] args) {

        MyThread1_71 bullet1 = new MyThread1_71();
        Thread gun1 = new Thread(bullet1);

        MyThread2_71 bullet2 = new MyThread2_71();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}
