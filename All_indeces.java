public class All_indeces {

    public static int[] Sol(int[] arr, int i, int n, int j){
        if(i==arr.length){
            return new int[j]; //this is going to return new array of size j;
        }

        int[] arr_fin;
        if(arr[i]==n){
            arr_fin=Sol(arr, i + 1, n, j + 1);
            arr_fin[j]=i;
        }else{
            arr_fin = Sol(arr, i + 1, n, j);
        }
        return arr_fin;
    }

    public static void main(String[] args) {
        int[] arr =  new int[]{3,2,3,3,5};
        int[] res=Sol(arr, 0,3 , 0);
        for(int i: res){
            System.out.println(i);
        }
    }
}
