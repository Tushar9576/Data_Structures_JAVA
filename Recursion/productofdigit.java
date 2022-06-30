public class productofdigit {
    public static void main(String[] args) {
        System.out.println(productdigit(1324));
    }
    static int productdigit(int n){
        if(n%10 == n){
            return n;
        }
        return n % 10 * productdigit(n/10);
    }
}
