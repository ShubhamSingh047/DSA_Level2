public class CheckNumber {
    //Recursion Helper Function !
    private static boolean SecrateSol(int input[], int index){
        if(index==input.length-1){
            return true;
        }
        if(input[index]>input[index+1]){
            return false;
        }
        return SecrateSol(input, index+1);
    }

    public static boolean CheckSorted(int[] input){
        return SecrateSol(input,0);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,4,5};
        System.out.println(CheckSorted(arr));
    }
}
