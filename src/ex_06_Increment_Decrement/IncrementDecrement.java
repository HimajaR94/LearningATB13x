package ex_06_Increment_Decrement;

public class IncrementDecrement {
    public static void main(String[] args) {
//        Program 1
        int a=5;
        int b=a++;
        System.out.println("a:"+a+"b:"+b);// a: 6 b:5

//        Program 2:
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // 4

//        Program 3
        int x = 5;

        System.out.println(x++ + ++x); //12

//        Program 4
        int c = 5;

        System.out.println(++c); // Output: 6

        System.out.println(c++); // Output: 6

        System.out.println(c);   // Output: 7


//        Program 5:  Interview Question

        int m = 5;

        int n = m++ + ++m;

        System.out.println("m: " + m); // Output: a:7

        System.out.println("m: " + n); // Output: b: 12

//        Program 6:  Interview Question

        int e = 5;

        int f = e++ + ++e + e++ + ++e;

        System.out.println("e = " + e + ", f = " +f); //Output x=9 y=28








    }
}
