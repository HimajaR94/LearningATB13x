package Test;

import java.util.Scanner;

public class Challenge13_TablePrint {
    public static void main(String[] args) {

        for (int n=1;n<=5;n++) {
            System.out.printf("Table of %d:\n",n);
            for (int i = 1; i <= 10; i++) {

                System.out.println(n + "*" + i + "=" + (n * i));
            }

        }
    }
}
