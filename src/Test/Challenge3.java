package Test;

import java.util.Scanner;

public class Challenge3 {

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
        boolean c= (a==b); //as 10 not equal to 5 result is false
        boolean d= (a>b); // as 10>5 result is true
        boolean e= (a<b); // as 10<5 is false
        boolean f=(a > b) && (a > 0); // 10>5 is true and 10>0 is true so the result is true
        boolean g=(a > b) || (a > 0); // 10>5 is true and 10>0 is true so the result is true
        boolean h=!(a > b); //Negative of 10>5 is false
        System.out.println("a==b:"+c+ " "+"a>b:"+d+" "+"a<b:"+e+" "+"(a > b) && (a > 0):"+f+" "+"(a > b) ||(a > 0):"+g+" "+"!(a > b):"+h);
        scanner.close();
    }
}
