public class CountFactors {
    static int Solve(int A){
        int count=0;
        for(int i=1; i*i<=A; i++){
            if(A%i==0){
                if(i!=A/i){
                    count+=2;
                    System.out.println(count);
                }
                else{
                    count+=1;
                    System.out.println(count);
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int res=Solve(16);
        System.out.println(res);
    }
}
//Id:- 7851335458
//passwd:- QVJxR0dJV01nVVI0UW9yWjRJWmJJQT09