package LinearSearch;

public class EvenDigits {
    public static void main(String[] args) {
//        int[] arr={12,345,67,34,246,65876};
//        int a= printnum(arr);
//        System.out.println(a);
        int[] numb={12,324,45656,34};
        System.out.println(printnum(numb));
        System.out.println(digits2(54654));
    }

    static int printnum(int[] numb){
        int count =0;
        for (int no:numb){
            if(even(no)){
                count++;
            }
        }
        return count;
    }
// function to checck if a number contains even number of digits or not
    static boolean even(int nums) {
        int numberofDigits=digits(nums);
//        if (numberofDigits%2==0){
//            return true;
//        }
//        return false;
        return numberofDigits%2==0;
    }

    static int digits(int num){
        int count =0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }

    static int digits2(int num){
        return (int)(Math.log(num))+1;
        //this is a short way to count the number of digit in the number
    }
}
