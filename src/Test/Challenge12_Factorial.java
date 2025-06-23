package Test;

import java.util.Scanner;

public class Challenge12_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value for n");
        int n = scanner.nextInt();
        if (n < 0) {
            System.out.println("Please enter a positive integer");

        }
        else if (n == 0)
            System.out.println("Factorial of 0 is: 1");
        else
        {
            int factorial=1;
        for (int i= n; i>=1;i--)
        {
         factorial=factorial*i;
        }
        System.out.printf("Factorial of %d is:%d\n",n,factorial);
    }
    }
}
