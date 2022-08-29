import java.util.ArrayList;

public class Array_List {
    //basic understanding of array list and string subset.
    public static void main(String[] args) {
        ArrayList<String> str= new ArrayList<>();
        str.add("Shubham");
        str.add("john");
        str.add("rahul");
        str.add("Shubham");
        System.out.println(str);
        System.out.println(str.get(0));
        str.set(0,"Naruto");
        System.out.println(str);
        str.add(1,"Saske");
        System.out.println(str);
    }
}
