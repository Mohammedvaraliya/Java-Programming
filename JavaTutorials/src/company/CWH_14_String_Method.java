package company;

public class CWH_14_String_Method {
    public static void main(String[] args) {

        String name = "Varaliya Mohammed";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lstring = name.toLowerCase();
        System.out.println(lstring);

        String ustring = name.toUpperCase();
        System.out.println(ustring);

        String nonTrimmedString = "     Hello     ";
        System.out.println(nonTrimmedString);

        String trimmedString = nonTrimmedString.trim();
        System.out.println(trimmedString);

        System.out.println(name.substring(7));
        System.out.println(name.substring(0,16));

        System.out.println(name.replace("m", "n"));
        System.out.println(name.replace("ohammed", "arshal"));

//        System.out.println(name.startsWith("Vara"));
//        System.out.println(name.endsWith("ed"));

        System.out.println(name.charAt(10));

        System.out.println(name.indexOf("Mo")); //If string is not prensent so return -1
        System.out.println(name.indexOf("a", 10));

        System.out.println(name.lastIndexOf("ed"));

        System.out.println(name.equals("Varaliya Mohammed"));
        System.out.println(name.equalsIgnoreCase("varaliya mohammed"));

        System.out.println("I am escape sequence character \" double quote");
        System.out.println("I am escape sequence character \\ back slash");
    }
}
