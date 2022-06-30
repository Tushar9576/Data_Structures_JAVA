public class sumofdigits {
    public static void main(String[] args) {
        System.out.println(sumdigit(1342));
    }
    static int sumdigit(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumdigit(n/10);
    }
}
