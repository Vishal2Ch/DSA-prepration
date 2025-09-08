package StringBui1d3r;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method {
    public static void main(String[] args) {
        String name = "vishal chauhan";
        System.out.println(Arrays.toString(name.toCharArray()));//this .tocharArray will convert it into a character array
        //Arrays.tostring just converts the string into an array
        System.out.println(name.indexOf('a'));
        System.out.println(name.toUpperCase());
        System.out.println("       vishal         ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
