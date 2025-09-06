import java.util.Scanner;
public class Funcitons {

//    static String greet(){
//        String new1="hello myself vishal how are you";
//        return new1;
    }
//    static void sum() {
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int  num1 = in.nextInt();
//        System.out.println("Please enter your next number");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }

//    static int sum2() {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter your first number");
//        int  num1 = in.nextInt();
//        System.out.println("Please enter your next number");
//        int num2 = in.nextInt();
//        int sum = num1 + num2;
//        return sum;
        //System.out.println("This line will never be executed as the fucntion stops at return statement");
        //}

// here you pass the value of numbers that you call in the main method LIKE PASSING THE PARAMETERS
    static int sum3 (int a , int b){
    int sum3 = a + b;
    return sum3;
}
//personalised greetings
    static String pgreet(String name){
    String man = "Hello " + name;
    return man;
    }
    public static void main(String[] args) {


    String person = pgreet("Vishal");
        System.out.println(person);

    int ans = sum3(2, 4);
        System.out.println(ans);
//        sum();
//        int a = sum2();
//        System.out.println(a);
//
//        String m = greet();
//        System.out.println(m);
    }

