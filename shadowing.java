public class shadowing {
    //shadowing is the concept of variables scope crossing each other's territory

    static int x = 90; //this will be shadowed on line 9 shadowing means lower level shadows the upper level.
    public static void main(String[] args) {
        System.out.println(x);//return 90

        int x = 40;
        System.out.println(x);//return 40
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
