package company;

public class CWH_27_arrays {
    public static void main(String[] args) {
//        String [] students = {"varaliya", "sameer", "Taha", "nabil"};
//        System.out.println(students[0]);
//        System.out.println(students.length);

        //float [] marks = {98.01f,89.9f,79.4f,77.9f,68.6f};
        int [] marks = {98,89,79,77,68};
        //System.out.println(marks.length);

        // Displaying the Array (Naive way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("for loop");
        for (int i=0; i< marks.length; i++){
            System.out.println(marks[i]);
        }

        // Displaying the Array (for loop) in reverse order
        System.out.println("for loop in reverse order");
        for (int i= marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array -- for each lop
        System.out.println("for each loop");
        for(int element : marks){
            System.out.println(element);
        }

    }
}
