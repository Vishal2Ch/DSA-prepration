import java.util.Arrays;
import java.util.Scanner;
public class VarArgs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        fun(34,46,3,457,5676,56,6);
        multiple(23,45,"hiki","jfifjh","kite","lono");
    }
    //if you want to have a mix arguments normal args as wll as keyword args

    static void multiple(int a, int b, String ...v){

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
        //this int ...v means variable length arguments that you could choose any number of variables as inputs
    }
}
