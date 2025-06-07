package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab003_ScannerClass {
    public static void main(String[] args) {

        System.out.println("Enter first number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Enter second number:");
        int b=sc.nextInt();
        sc.close();
        System.out.println(a+b);

    }

}
