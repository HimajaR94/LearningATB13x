package ex_07_UserInput;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        System.out.println("Enter sides of a Triangle");

        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        int b =scanner.nextInt();
        int c =scanner.nextInt();

        if (a==b&&b==c)
        System.out.println("Equilateral triangle");

        else if(a==b||b==c||a==c)
        System.out.println("Isosceles triangle");

        else
        System.out.println("Scalene triangle");

        scanner.close();

    }
}
