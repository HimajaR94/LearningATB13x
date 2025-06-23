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
        System.out.println("Enter the operation to be performed:\n 1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
        String op=scanner.next().toLowerCase();

        switch (op)
        {
            case "addition","add", "1":
                System.out.println("Addition:"+(a+b));
                break;
            case "subtraction", "subtract", "2":
                System.out.println("Subtraction:"+(a-b));
                break;
            case "multiplication", "multiply", "3":
                System.out.println("Multiplication:"+(a*b));
                break;
            case "division", "divide", "4": {
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
