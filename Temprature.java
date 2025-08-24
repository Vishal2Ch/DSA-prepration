import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temp in celcius");
        float tempC = in.nextFloat();

        float temp_in_farenhite = (tempC * 9/5) + 32;
        System.out.println(temp_in_farenhite);
    }
}
