package Test;

import java.util.Scanner;

public class Challenge6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        int n=scanner.nextInt();
        if(n==0)
            System.out.println("0");
        else if(n<0)
            System.out.println("Negative number");
        else
            System.out.println("Positive number");
        scanner.close();
    }
}
