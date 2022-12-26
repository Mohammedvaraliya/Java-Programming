package company;

public class CWh_15_Ps3 {
    public static void main(String[] args) {

//        Problem No 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

//        Problem 2
        String name2 = "Hello i am varaliya Mohammed";
        name2 = name2.replace(" ", "_");
        System.out.println(name2);

//        Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Shubham");
        System.out.println(letter);

//        Problem 4
        String myString = "This string contain  double and triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

//        Problem 5
        String myLetter = "Dear unknown, \n\tThis java course is Nice.\n\tThanks";
        System.out.println(myLetter);
    }
}
