package Test;

import java.util.Scanner;

public class Challenge4 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner scanner=new Scanner(System.in);
        int i=scanner.nextInt();

        System.out.println("Original:"+i+" "+"Pre-increment:"+(++i)+" "+"Post=increment:"+(i++)+" "+"Pre-decrement:"+(--i)+" "+"Post-decrement:"+(i--));



    }
}
