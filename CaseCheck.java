import java.util.Scanner;
public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        System.out.println(ch);
//        String word = "hello";
//        System.out.println(word.charAt(2));
        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase");
        }else System.out.println("please enter a valid alphabet");

    }
}
