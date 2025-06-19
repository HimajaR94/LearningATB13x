package Test;

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner scanner=new Scanner(System.in);
        if(!scanner.hasNextInt())
        {
            System.out.println("Please enter integer value");
            return;
        }
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int add=a+b; //15
        int sub=a-b; //5
        int mul=a*b; //50
        int div=a/b; //2
        int mod=a%b; //0
        System.out.println("Addition:"+add + " "+"Subtraction:"+sub+" "+"Multiplication:"+mul+" "+"Division:"+div+" "+"Modulus:"+mod);
    }
}
