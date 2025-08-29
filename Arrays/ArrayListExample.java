package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Array list allows you to take as many inputs as you can without any case of space running out
        ArrayList<Integer> list = new ArrayList<>(10);
//        list.add(34);
//        list.add(390);
//        list.add(56);
//        list.add(23);
//        list.add(456);
//        list.add(678);
//        list.add(678);
//        list.add(87);
//        list.add(786);
//        list.add(76);
//        list.add(3456);
//        list.add(654);
//        list.add(456);
//        list.add(78);
//        list.add(57);
//        list.add(455);
//        System.out.println(list.contains(678));
//        list.remove(3);
//        list.set(5,89);
        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get element at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
