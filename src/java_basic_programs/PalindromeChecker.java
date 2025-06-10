package java_basic_programs;

import java.lang.ref.Cleaner;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Enter a String");
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        String cleaned="";
        for (int i=0; i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                cleaned+=Character.toLowerCase(ch);

            }
        }
        String reversed="";
        for (int i=str.length()-1;i>=0;i--)
        {
            reversed+=cleaned.charAt(i);
        }
        if(cleaned.equals(reversed))
            System.out.println("The String is a palindrome");
        else
            System.out.println("The String is not a palindrome");



    }
}
