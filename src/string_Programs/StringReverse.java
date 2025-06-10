package string_Programs;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        System.out.println("Enter a String:");
        Scanner sc= new Scanner(System.in);

        String str=sc.nextLine();
        String reverse="";
        for (int i=str.length()-1;i>=0;i--)
        {
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
        sc.close();
    }
}
