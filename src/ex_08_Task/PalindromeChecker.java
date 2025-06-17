package ex_08_Task;

import javax.xml.transform.Source;
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {

        System.out.println("Enter a String:");
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();

        String cleaned="";
        for (int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetterOrDigit(ch))
            {
                cleaned+=Character.toLowerCase(ch);
            }

        }
        System.out.println("cleaned string:"+cleaned);

        String reverse="";
        for (int i=cleaned.length()-1;i>=0;i--)
        {
            reverse+=cleaned.charAt(i);
        }
        System.out.println("Reversed string:"+reverse);
        if(cleaned.equals(reverse))
            System.out.println("Palindrome string");
        else
            System.out.println("Not a Palindrome string");


    }

}
