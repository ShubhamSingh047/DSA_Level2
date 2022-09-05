public class fibnachiseries {
    public static int Sol(int n){
        if(n==0){
            return 0;
        }
        if(n<2){
            return n;
        }
        return Sol(n-1)+Sol(n-2);
    }
    public static void main(String[] args) {
        int sol = Sol(7);
        System.out.println(sol);
    }
}
