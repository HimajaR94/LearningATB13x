package Test;

import java.util.Scanner;

public class Challenge11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter value for n");
        int n=scanner.nextInt();
        for (int i= 1; i<=n;i++)
        {
            System.out.print(i+" ");
        }
    }
}
