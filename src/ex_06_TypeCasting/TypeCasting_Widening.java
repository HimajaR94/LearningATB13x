package ex_06_TypeCasting;

import java.io.PrintStream;

public class TypeCasting_Widening {
    public static void main(String[] args) {

        int a=100;
        double b=a;//Widening --> implicit casting
        double b1=(double)a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);
    }

}
