import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        String fruit = in.next();

//        switch (fruit) {
//            case "Mango" -> System.out.println("Kings of fruit");
//            case "Orange" -> System.out.println("rich in vitamin C");
//            case "Banana" -> System.out.println("best fruit before GYM");
//            case "kiwi" -> System.out.println("Increases your platelates");
//            case "Apple" -> System.out.println("this is a best fruit for attaining abs");
//            default -> System.out.println("Put something as a valid fruit");
//        }

        int day = in.nextInt();
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("please enter a day between 1 to 7");
        }
    }
}
