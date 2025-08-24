import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//        int num3 = num1 + num2;
//        System.out.println(num3);
//
//        Float e = input.nextFloat();
//        Float d = input.nextFloat();
//        Float s = e + d;
//        System.out.println(s);

        //typecasting
//        int num = (int) (65.45f); //narrowing down float into integer using type casting
//        System.out.println(num);

        //automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a);
//        System.out.println(b);

        //java automatic datatype promotion
//        byte a = 34;
//        byte b = 64;
//        byte c = 35;
//        int d = a *b /c;
//        System.out.println(d);

        //automatic type conversion returning the ascii values
        int red = 'A';
        System.out.println(red);

        //integer multiplied integer returns integer
        System.out.println(3 * 3);
        //float multiplied integer returns float
        System.out.println(3 * 4.5);
        //float multiply float returns float
        System.out.println(34.4 * 8.9);
        //double multiply by int or byte or float returns double
        System.out.println(45.23 * 4);
        System.out.println(45.23 * 6.6f);
        System.out.println(45.23 * 6.6);

        byte b =43;
        char c = 'a';
        short s = 123;
        int i = 4000;
        float f = 45.54f;
        double d = 0.1234;
        double result = (f * b) + (i / c) - (d - s);
        System.out.println((f * b) + (i / c)+(d - s));
        System.out.println(result);

    }
}
