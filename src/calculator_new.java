
import java.util.Scanner;

public class calculator_new {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans =0;


        while(true){
            char op = in.next().trim().charAt(0);
            System.out.println("Enter the operators");
            if(op =='+' || op =='-' || op == '*' || op =='/' || op=='%'){
                //taking two numbers from user
                System.out.println("Enter the  first number");
                int num1 = in.nextInt();
                System.out.println("Enter the second number");
                int num2 = in.nextInt();

                if(op=='+'){
                    ans=num1+num2;
                }if(op=='-'){
                    ans=num1-num2;
                }if(op=='*'){
                    ans=num1*num2;
                }if(op=='/'){
                    if (num2!=0) {
//                        System.out.println("any number cannot be divided by zero");
                        ans = num1 / num2;
                    }
                }if(op=='%'){
                    ans=num1%num2;
                }
            }else if (op == 'x' || op == 'X'){
                break;
            }else {
                System.out.println("Invalid operator");
            }
            System.out.println(ans);
        }

    }
}
