package Strings;

import java.util.ArrayList;

public class operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3)); //return "d" it will count a + 3 alphabets
        System.out.println('a'+3); // will return 100 after adding ascii value of a (97)+3=100
        System.out.println("a"+1);//adding a string with a number will return "a1" it just concatenate
        //when an integer is concatenated with a string it is converted into a wrapper type class integer
        System.out.println("vishal"+ new ArrayList<>());
        System.out.println("vishal"+ new Integer(47));
//        System.out.println(new Integer(47) + new ArrayList<>()); //this will not work as two attributes cannot be get operated until
        //there is one primitive data type or string data type
        System.out.println(new Integer(34)+"" +new ArrayList<>());
    }
}
