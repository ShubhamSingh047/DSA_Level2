public class Sum_Of_Arrays {
    static int Sol(int[] arr){
        if(arr.length==0){
            return 0;
        }
        int small_arr[]= new int[arr.length-1];
        for(int i=1; i<arr.length; i++){
            small_arr[i-1]=arr[i];
        }
        return arr[0]+Sol(small_arr);
    }

    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4};
        System.out.println(Sol(arr));
    }
}
