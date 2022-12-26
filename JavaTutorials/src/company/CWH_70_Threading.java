package company;

class MyThread1_70 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("My Thread1 is Running");
            System.out.println("I am a good coder");
            i +=1;
        }

    }
}

class MyThread2_70 extends Thread{

    @Override
    public void run(){
        int i = 0;
        while(i<400){
            System.out.println("My Thread2 is Running");
            System.out.println("I am sad");
            i +=1;
        }

    }
}

public class CWH_70_Threading {
    public static void main(String[] args) {

        MyThread1_70 t1 = new MyThread1_70();
        MyThread2_70 t2 = new MyThread2_70();
        t1.start();
        t2.start();
    }
}
