package BinarySearchx;

public class Smallest_charcter_greater_thanthe_target_Element {
    public static void main(String[] args) {
//        int[] arr={1,4,7,8,10,13,15,19,23,26,29,35};
        char[] arr={'a','e','i','o','u','w','y','z'};
        char target = 'c';
        char m= ceil(arr,target);
        System.out.println(m);
    }
    //returning the smallest character greater than the target,
    static char ceil(char[] letters,char target){
        int start =0;
        int end= letters.length-1;
        if (target >= letters[end]) {
            return letters[0];  // No ceiling exists
        }

        while(start<=end){
            int mid = start+ (end-start)/2;

            if(target<letters[mid]){
                end=mid -1;
            } else if (target>letters[mid]) {
                start=mid+1;
            }else return (char) mid;
        }
        return letters[start];
    }
}
