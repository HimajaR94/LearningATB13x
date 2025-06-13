package ex_04_Ternary_Operator;

import java.util.Scanner;

public class MaxOfTwoNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b=scanner.nextInt();
        int result= a>b?a:b;
        System.out.println("Max of two numbers:"+result);
        System.out.println("Min of two numbers:"+Math.min(a,b));
        scanner.close();

    }
}
