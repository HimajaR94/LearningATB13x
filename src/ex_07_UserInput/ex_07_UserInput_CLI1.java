package ex_07_UserInput;

public class ex_07_UserInput_CLI1 {
    public static void main(String[] args) {
        String ageString= args[0];
        System.out.println(ageString);
        int age= Integer.parseInt(ageString);
        if (age>=18)
            System.out.println("Allowed to vote");
        else
            System.out.println("Not allowed to vote");
    }
}
