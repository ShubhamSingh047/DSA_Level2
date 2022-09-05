import java.util.Scanner;

public class Power {

    static int count(int n){
        int num=0;
        if(n<=1){
            return 0;
        }
        num++;
        n=n%10;
        System.out.println(n/10);
        count(n/10);
        System.out.println(num);
        return num;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();
        int res = count(n);

    }
}
