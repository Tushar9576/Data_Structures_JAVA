public class power {
    public static void main(String[] args) {
        int base = 5;
        int pow = 5;
        int ans = 1;

        while(pow>0){
            if((pow&1) == 1){
                ans *= base;
            }
            base *= base;
            pow = pow >> 1;
        }
        System.out.println(ans);
    }

}
