package Arrays;

public class sorted {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,7,8,9,12};
        System.out.println(issorted(arr, 0));
    }
    static boolean issorted(int[] arr, int index){
        if(index == arr.length -1){
            return true;
        }
        return arr[index] < arr[index + 1] && issorted(arr, index+1);
    }
}
