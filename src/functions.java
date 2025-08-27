import java.util.Scanner;
public class functions {
    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello choose first number");
        int num1 = in.nextInt();
        System.out.println("Choose your next number");
        int num2 = in.nextInt();
        int add =0;
        add=num1 + num2;
        System.out.println(add);
    }
    public static void main(String[] args) {
        sum();
    }
}
