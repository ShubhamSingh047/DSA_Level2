public class checkSorted {
    //we are given an array we need to check if input array is sorted or not !
    static boolean sol(int[] arr){
        if(arr.length<=1){
            return true;
        }

        int small_arr[] = new int[arr.length-1];
        for(int i=1; i< arr.length; i++){
            small_arr[i-1] = arr[i];
        }
        boolean small_sorted = sol(small_arr);
        if(!small_sorted){
            return false;
        }else{
            if(arr[0]<=small_arr[0]){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]=new int[]{7,2,3,4,5};
        boolean f_ans=sol(arr);
        System.out.println(f_ans);
    }
}
