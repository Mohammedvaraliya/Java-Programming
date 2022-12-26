package company;

public class CWH_32_method_overloading {

    static void foo(){
        System.out.println("Good Morning");
    }

    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!");
        }

    static void foo(int a, int b){
        System.out.println("Good Morning " + a + " And " + b + " bro!");
        }

    static void change(int a){
        a = 767;
    }

    static void change2(int [] arr){
        arr[0] = 98;
    }

    static void tellJoke(){
        System.out.println("I have made a new world ... did u know");
    }

    public static void main(String[] args) {
        //tellJoke();

        //changing the integer
//        int x = 45;
//        change(x);
//        System.out.println("The value of x after running change is : "+ x);
//        which will not change the value x

        //changing the array
//        int [] array = {52, 54, 67, 876, 242, 675};
//        change2(array);
//        System.out.println("The value of array[0] after running change is : "+ array[0]);
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+" ");
//        }

        // Method Overloading
        foo();
        foo(200);
        foo(199,256);

    }
}
