package String_Test;

public class Challenge2 {

    public static void main(String[] args) {
        String str1="Hello";
        String str2="hello";
        String str3="Hello";

        System.out.println("equals():"+str1.equals(str2)); //false
        System.out.println("equals():"+str1.equals(str3)); // returns true
        System.out.println("equalsIgnoreCase():"+str1.equalsIgnoreCase(str2)); // returns true
        System.out.println("compareTo():"+str1.compareTo(str2)); // returns negative integer (=32)
    }
}