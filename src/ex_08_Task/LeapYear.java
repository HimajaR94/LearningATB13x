package ex_08_Task;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        System.out.println("Enter a Year");
        Scanner scanner=new Scanner((System.in));
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter a numeric value");
            return;
        }
        int year=scanner.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0))
        {
            System.out.println("Leap year");
        }
        else
            System.out.println("Not a Leap year");

        scanner.close();
    }
}
