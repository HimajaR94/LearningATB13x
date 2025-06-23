package Test;

import java.util.Scanner;

public class Challenge7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        //a>b a>c a
        //a>b a<c c
        //a<b b<c c
        //a<b b>c b

        int max= (a>b)?((a>c)?a:c):((b>c)?b:c);

        System.out.println(max);
        scanner.close();

    }
}
