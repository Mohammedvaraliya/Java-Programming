package company;

class My_Thread_74 extends Thread{

    public My_Thread_74(String name){
        super(name);
    }

    public void run(){
        int i = 0;
        while (true){
            System.out.println("I am " + this.getName());
        }
    }

}

public class CWH_74_thread_priorities {
    public static void main(String[] args) {
//        Ready queue: T1 T2 T3 T4
        My_Thread_74 t1 = new My_Thread_74("t1");
        My_Thread_74 t2 = new My_Thread_74("t2");
        My_Thread_74 t3 = new My_Thread_74("t3");
        My_Thread_74 t4 = new My_Thread_74("t4");
        My_Thread_74 t5 = new My_Thread_74("t5 (most imp thread)");

//        To make the priority first of the thread
        t5.setPriority(Thread.MAX_PRIORITY);

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
