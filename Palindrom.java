public class Palindrom {
    static boolean isPalindrome(String s){
        int i=s.length();
        int j=0;
        boolean res=true;
        if(s.length()==0){
            return true;
        }else if(s.charAt(j)!=s.charAt(i)){
            res=false;
            j++;
        }
        return true;
//        isPalindrome(s.charAt(i-1));
    }

    public static void main(String[] args) {

    }
}
