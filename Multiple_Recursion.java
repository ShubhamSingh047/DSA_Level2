public class Multiple_Recursion {
    //fibonachi number is example of multiple recusrsion calls.
    static int Sol(int n){
        if(n<=1) return n;
        int res = Sol(n-1)+Sol(n-2);
        return res;
    }

    public static void main(String[] args) {
        int res = Sol(4);
//        System.out.println(res);
    }
}
