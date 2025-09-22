package Recursion;

import java.util.ArrayList;

public class BnrySrchuzgRecur {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,26,37,37,47,79};
//        int target=37;
//        System.out.println(find(arr,37,0));
//        System.out.println(findindex(arr,37,0));
//        System.out.println(findindexlast(arr,37,arr.length-1));
//        findindexall(arr,37,0);
//        System.out.println(list);
//        System.out.println(findindexallarrlst(arr,37,0, new ArrayList<>()));
//        ArrayList<Integer> ans = findindexallarrlst(arr,37,0, new ArrayList<>());
//        System.out.println(ans);
        System.out.println(findindexallarrlst(arr,37,0));
    }
    static boolean find(int[] arr, int target, int index){
        if (index==arr.length){
            return false;
        }
        return arr[index]==target ||  find(arr,target,index+1);
    }
    static int findindex(int[] arr, int target, int index){
        if (index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return findindex(arr,target,index+1);
    }
    static int findindexlast(int[] arr, int target, int index){
        if (index==-1){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return findindex(arr,target,index-1);
    }
    static ArrayList<Integer> list = new ArrayList<>();
    static void findindexall(int[] arr, int target, int index){
        if (index==arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
       findindexall(arr,target,index+1);
    }

    static ArrayList<Integer> findindexallarrlst(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if (index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
       ArrayList<Integer> ansFromBelow = findindexallarrlst(arr,target,index+1);
        list.addAll(ansFromBelow);
        return list;
    }
}
