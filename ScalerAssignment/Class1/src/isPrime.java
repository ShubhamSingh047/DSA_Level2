public class isPrime {
    static int Solve(long A){
        int sol=1;
        for(long i=2; i*i<=A; i++){
            if(A%i==0){
                System.out.println(i);
                sol = 0;
                break;
            }
        }
        return sol;
    }
    public static void main(String[] args) {
        int res=Solve(67010446483l);
        System.out.println(res);
    }
}
