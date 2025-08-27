import java.util.Scanner;
public class SWAP {
    static String changename(String name){
     String nake = "hi how are you " + name ;
//        System.out.println(nake);
        return nake;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =2;
        int b =3;

        //method to do swappingof numbers
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a+ " "+ b);
        ///////////////////////////////////////////////////
        System.out.println("Please enter your name");
        String kite = in.next();
        String hi = changename(kite);
        System.out.println(hi);

    }
}
