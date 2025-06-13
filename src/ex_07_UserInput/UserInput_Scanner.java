package ex_07_UserInput;

import java.util.Scanner;

public class UserInput_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter age:");
        Scanner scanner= new Scanner(System.in);
        int age= scanner.nextInt();

        String canIVote= (age>=18)?"Yes":"No";
        System.out.println(canIVote);
        scanner.close();
    }
;}
