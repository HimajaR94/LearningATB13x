package Test;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Challenge10_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a =scanner.nextInt();
        int b= scanner.nextInt();
        System.out.println("Enter the operation to be performed:\n 1.'+' for Addition \n 2.'-'Subtraction \n 3.'*'Multiplication \n 4.'/'Division");
        String op=scanner.next();

        switch (op)
        {
            case "+":
                System.out.println("Addition:"+(a+b));
                break;
            case "-":
                System.out.println("Subtraction:"+(a-b));
                break;
            case "*":
                System.out.println("Multiplication:"+(a*b));
                break;
            case "/": {
                if (b == 0) {
                    System.out.println("Error: cannot divide by zero");
                } else {
                    System.out.println("Division:" + (double)(a / b));
                }
                break;
            }
            default:
                System.out.println("Invalid Operation! Select operation from the options");


        }
        scanner.close();


    }

}
