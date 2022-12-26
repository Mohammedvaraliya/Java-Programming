package company;

import javax.print.Doc;
import java.util.function.DoubleConsumer;

class Ekclass{
    int a;

    public int getA() {
        return a;
    }

    Ekclass(int v){
        this.a = v;
    }

    public int returnOne(){
        return 1;
    }
}

class Doclass extends Ekclass{
    Doclass(int d){
        super(d);
        System.out.println("i am an a constructor");
    }

}

public class CWh_47_this_super {
    public static void main(String[] args) {

        Ekclass e1 = new Ekclass(5);
        System.out.println(e1.getA());
        System.out.println(e1.returnOne());

        Doclass d = new Doclass(65);
        System.out.println(d.getA());


    }
}
