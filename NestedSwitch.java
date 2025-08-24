import java.util.Scanner;
public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String department = in.next();

        switch(empId){
            case 1:
                System.out.println("Vishal singh chauhan");
                break;
            case 2:
                System.out.println("Tanishk chauhan");
                break;
            case 3:
                System.out.println("Meenakshi tomar");
                break;
            case 4:
                switch(department){
                case "it":
                    System.out.println("Devops seniour engineer");
                    break;
                case "mechanical":
                    System.out.println("Automibiles Engineer");
                    break;
                case "Management":
                    System.out.println("Business consultant");
                    break;
                default:
                    System.out.println("you have not entered any valid department");
            }
            break;
            default:
                 System.out.println("Enployees not found");
        }
    }
}
