public class FindUnique {
    public static void main(String[] args) {
         int [] arr = {2,3,4,2,3,4,8,7,1,7,9,8,1};
        System.out.println(ans(arr));
    }
    static int ans(int[] arr){
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
}
