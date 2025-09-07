package InsertionSort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={4,5,1,2,3};
        insertion(arr);
        System.out.println(arr);
    }

    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0; j++) {
                if (arr[j]<arr[j-1]){
                    swaparray(arr,j,j-1);
                }else break;

            }
        }
    }

    static void selection(int[] arr){
        for(int i =0; i<arr.length; i++){
            //find the maximum element in the remaining array and swap with correct index
            int last = arr.length-i-1;
            int maxindex= getMaxIndex(arr,0,last);
            swaparray(arr,maxindex,last);
        }
    }

    static int getMaxIndex(int[] arr,int start,int end){
        int max=start;

        for (int i = start; i < end; i++) {
            if (arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

    static void swaparray(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    static void bubble(int[] arr){
        boolean swapped;
        //run the step n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //each step the max item wil comae at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                //swap if item is smaller than the previous item
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            if (!swapped){
                break;
            }
        }
    }
}
