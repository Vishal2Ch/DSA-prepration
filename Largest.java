import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number \n");
        int a =in.nextInt();
        System.out.println("Enter the second number\n");
        int b =in.nextInt();
        System.out.println("Enter the third number \n");
        int c =in.nextInt();

//        int max =a;
        if (a > b && a > c){
            System.out.println(a+ "is the greatest of all numbers");
        } else if (b>a && b> c) {
            System.out.println(b + "is the greatest number");
        }else System.out.println(c +"is the greatest number");
    }
}
