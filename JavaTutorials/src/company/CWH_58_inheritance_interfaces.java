package company;

interface sampleInterface_58{
    void meth1();
    void meth2();
}

interface childSampleInterface_58 extends sampleInterface_58{
    void meth3();
    void meth4();

}

class MySampleClass_58 implements childSampleInterface_58{
    public void meth3(){
        System.out.println("I am Method 3");
    }

    public void meth4(){
        System.out.println("I am Method 4");
    }

    public void meth1() {
        System.out.println("I am Method 1");

    }

    public void meth2() {
        System.out.println("I am Method 2");

    }
}

public class CWH_58_inheritance_interfaces {
    public static void main(String[] args) {

        MySampleClass_58 sample = new MySampleClass_58();
        sample.meth1();
        sample.meth2();
        sample.meth3();
        sample.meth4();

    }
}
