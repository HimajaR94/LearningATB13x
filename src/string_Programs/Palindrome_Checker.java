package string_Programs;

import java.util.Scanner;

public class Palindrome_Checker {

    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        String cleaned="";

        String reverse="";
        for (int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        if(str.equals(reverse))
            System.out.println("String is a palindrome");
        else
            System.out.println("String is not a Palindrome");
    }
}
