public class last_Index {

    static int Sol(int[] arr,int i, int n){
        int l = arr.length;
        if(i==l){
            return -1;
        }
        int liisa = Sol(arr, i+1, n);
        if(liisa==-1){
            if(arr[i]==n){
                return i;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }

    public static void main(String[] args) {
        int[] arr =new int[]{1,3,5,4,3,3};
        int res= Sol(arr,0, 3);
        System.out.println(res);
    }
}
