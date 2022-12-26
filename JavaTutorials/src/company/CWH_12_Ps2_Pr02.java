package company;

public class CWH_12_Ps2_Pr02 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

//        Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
