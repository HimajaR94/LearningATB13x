package ex_08_Task;

import java.util.Scanner;

public class VowelsConsonants_Count {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=scanner.nextLine();
        int vowels=0, consonants=0;
        String cleaned="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

                if (Character.isLetter(ch)) {
                    cleaned += Character.toLowerCase(ch);
                                   }

        }
        System.out.println("Cleaned String:"+cleaned);
        for(int i=0;i<cleaned.length();i++) {

            char ch=cleaned.charAt(i);
            if (ch== 'a'|| ch == 'e'|| ch == 'i'|| ch == 'o' || ch == 'u')
                vowels++;
            else
                consonants++;
        }
        System.out.println("Vowels in the given string:"+vowels);
        System.out.println("Consonants in the given string:"+consonants);
        scanner.close();
    }
}
