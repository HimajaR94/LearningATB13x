package Test;

import java.util.Scanner;

public class Challenge14_Star_Pattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        System.out.println("\nRight Triangle Pattern:");
        for (int i = 1; i <= n; i++) {  // Rows
            for (int j = 1; j <= i; j++) {  // Stars in each row
                System.out.print("* ");
            }
            System.out.println();  // Move to next line
        }


        System.out.println("\nPyramid Pattern:");
        for (int i = 1; i <= n; i++)
        {
            for (int space = 1; space <= n - i; space++)
            {
                System.out.print("  ");  // Two spaces for alignment
            }
        // Print stars
            for (int star = 1; star <= (2 * i - 1); star++)
            {
                System.out.print("* ");
            }
            System.out.println();  // Move to next line
        }
    }
}


