package LinearSearch;

public class MaxWealth {
    public static void main(String[] args) {

    }
    public int maximumwealth(int[][] accounts){
        //person is row
        //account is column
        int ans=Integer.MIN_VALUE;
        for (int person =0; person<accounts.length; person++){
            int row_sum=0;
            for (int account=0; account<accounts[person].length;account++){
                row_sum+=accounts[person][account];
            }
            if(row_sum>ans){
                ans=row_sum;
            }
        }
        return ans;
    }
}
