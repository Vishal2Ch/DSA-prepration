import java.util.Scanner;
public class Funcitons {

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your first number");
        int  num1 = in.nextInt();
        System.out.println("Please enter your next number");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        sum();
        }

}
