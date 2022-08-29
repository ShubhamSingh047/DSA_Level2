import java.util.ArrayList;

public class Subsequence_Print {

    static ArrayList Sol(String str){
        if(str.length()==0){
            ArrayList<String> failcase= new ArrayList<>();
            failcase.add("");
            return failcase;
        }
        char firstChar =  str.charAt(0);
        String restStr = str.substring(1);

        ArrayList<String> rres = Sol(restStr);
        ArrayList<String> myres = new ArrayList<>();
        for(String s:rres){
            myres.add(""+s);
            myres.add(firstChar+s);
        }
        return myres;
    }
    public static void main(String[] args) {
        ArrayList<String> res=Sol("abc");
        System.out.println(res);
    }
}
