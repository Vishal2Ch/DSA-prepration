package PatternPr1nting;

public class starPattern {
    public static void main(String[] args) {
//        pattern(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern28(6);
//        pattern30(6);
//        pattern17(4);
        pattern31(5);
    }

    static void pattern31(int n){
        int originalN =n;
        n=2*n;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int atEveryIndex=originalN-Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex+" ");
            }
            System.out.println();
        }
    }

    static void pattern30(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = row; col >=1; col--) {
                System.out.print(col);
            }
            for (int col =2; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern17(int n){
        for (int row = 1; row <= 2 * n; row++) {

            int c = row > n ? 2 * n - row: row;

            for (int space = 0; space < n-c; space++) {
                System.out.print(" ");
            }
            for (int col = c; col >=1; col--) {
                System.out.print(col+" ");
            }
            for (int col =2; col<=c; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            //for every number of row there must be equal number of columns
            //also for every row run the row
            for (int col = 1; col <=row ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for (int row = 1; row <= n; row++) {
            //for every number of row there must be equal number of columns
            //also for every row run the row
            for (int col = 1; col <=n ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for (int row = 1; row <= n; row++) {
            //for every number of row there must be equal number of columns
            //also for every row run the row
            for (int col = n; col >=row ; col--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            //for every number of row there must be equal number of columns
            //also for every row run the row
            for (int col = 1; col <=row ; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col <= totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern28(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalColInRow = row >= n ? 2 * n - row: row;

            int noOfSpaces=n-totalColInRow;
            for (int s = 0; s < noOfSpaces; s++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalColInRow; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
