import java.util.Scanner;

public class basics_loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        int count = 1;
//        while(count != 5){
//            System.out.println("Hello World");
//            System.out.println(count);
//            count++;
//        }

//        for (int i = 0; i < 10; i++) {
//            System.out.println("this is " +i+" time");
//        }
//        int num1 = in.nextInt();
//        for(int num =0; num < num1; num++){
//            System.out.println(num);
//        }

//        int num =1;
//        while(num<=5)
//        {
//            System.out.println("Hello World");
//            num++;
//        }

        int n = 1;
        do{
            System.out.println(n);
            n++;
        } while (n <= 6);{
            System.out.println("this is "+n+" time");
        }

    }
}
