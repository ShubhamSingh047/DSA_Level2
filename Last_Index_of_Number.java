public class Last_Index_of_Number {
        private static int SecrateSol(int input[],int x, int index){
            int result=-1;
            if(index==input.length-1){
                return result;
            }
            int res=SecrateSol(input, x, index+1);
            if(res==-1){
                if(input[index]==x){
                    return index;
                }else{
                    return -1;
                }
            }else{
                return res;
            }
        }

        public static int lastIndex(int input[], int x) {
            /* Your class should be named Solution
             * Don't write main().
             * Don't read input, it is passed as function argument.
             * Return output and don't print it.
             * Taking input and printing output is handled automatically.
             */
            return SecrateSol(input,x,0);
        }

        public static void main(String[] args) {
            int[] arr = new int[]{4,2,3,1,5};
            System.out.println(lastIndex(arr,4));
        }
}
