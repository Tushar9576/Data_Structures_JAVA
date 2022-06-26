import java.util.Arrays;

public class bubble {
    public static void main(String[] args) {
        int[] arr = {0,5,4,3,1,2,-1};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
       // System.out.println("hello");
    }
    static void insertion(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }else{
                    break;
                }
            }
            
        }
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr, maxindex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }


    private static int getmaxindex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i < end; i++) {
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    private
    static void bubblesort(int[] arr){
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
}
