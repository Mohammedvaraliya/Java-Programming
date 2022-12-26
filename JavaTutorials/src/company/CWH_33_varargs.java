package company;

public class CWH_33_varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
//    static int sum(int a,int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a,int b, int c, int d){
//        return a+b+c+d;
//    }

    static int sum(int x, int...arr){
        //Available as (int [] arr)
        int result = x;
        for(int element: arr){
            result += element;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("The sum of 7 and 9 is : "+ sum(8,9));
        System.out.println("The sum of 3, 4 and 5 is : "+ sum(3,4,9));
        System.out.println("The sum of 3, 4, 5 and 6 is : "+ sum(3,4,5,6));

    }
}
