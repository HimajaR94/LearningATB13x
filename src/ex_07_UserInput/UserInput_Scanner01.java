package ex_07_UserInput;

import java.util.Scanner;

public class UserInput_Scanner01 {
    public static void main(String[] args) {
        System.out.println("Enter the string:");
        Scanner scanner= new Scanner(System.in);
        String s=scanner.next();
        System.out.println(s);

        System.out.println("Enter the integer value");
        int int_input=scanner.nextInt();
        System.out.println(int_input);

        System.out.println("Enter the double value");
        double double_input=scanner.nextDouble();
        System.out.println(double_input);
        scanner.close();


    }
}
