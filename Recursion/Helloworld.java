package Recursion;

public class Helloworld {
    public static void main(String[] args) {
        message();
    }
    static void message(){
        System.out.println("hello World");
        message1();
    }
    static void message1(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
    }


}
