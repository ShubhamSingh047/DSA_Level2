public class PerfectSqr {
    static int Solve(int A){
        int sol=-1;
        for(int i=2; i*i<=A; i++){
            System.out.println(i);
            if(i*i==A){
                sol=i;
                break;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int sol = Solve(16);
        System.out.println(sol);
    }
}
