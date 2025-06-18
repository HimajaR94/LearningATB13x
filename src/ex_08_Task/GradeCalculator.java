package ex_08_Task;

import java.util.Scanner;

public class GradeCalculator {
  /*  Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F)
    based on the following grading scale:

    A: 90-100

    B: 80-89

    C: 70-79

    D: 60-69

    F: 0-59
*/
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter marks");
        if(!scanner.hasNextInt())
        {
            System.out.println("Please enter the numeric value");
            return;
        }
        int marks=scanner.nextInt();
        if (marks>100 || marks<0) {
            System.out.println("Enter valid marks between 0 and 100");
            return;
        }
        if(marks>=90&& marks <= 100){
            System.out.println("Grade A");
        } else if (marks>=80 && marks<=89) {
            System.out.println("Grade B");
        } else if (marks>=70 && marks <=79) {
            System.out.println("Grade C");
        } else if (marks >= 60 && marks <=69) {
            System.out.println("Grade D");
            
        } else  {
            System.out.println("Grade F");
        }


    }
}
