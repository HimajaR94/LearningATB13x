package Test;

import java.util.Scanner;

public class Challenge5 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        double b=scanner.nextDouble();

        double sum= (double)a+b; //implicit casting
        int ex_sum=a+(int)b; //explicit casting


        System.out.println(sum);
        System.out.println(ex_sum);
        scanner.close();

    }
}
