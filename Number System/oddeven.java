public class oddeven {
    public static void main(String[] args) {
        int n = 65;
        System.out.println(isodd(n));
    }
   static  boolean isodd(int n){
        return (n & 1) == 1;

    }

}
