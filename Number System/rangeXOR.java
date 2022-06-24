public class rangeXOR {
    public static void main(String[] args) {
        // range XOR for a till b = XOR(b) ^ XOR(a-1)
        int a = 3;
        int b = 9;
        int ans = startxor(b) ^ startxor(a-1);
        System.out.println(ans);

    }
    public static int startxor(int a){
        if(a%4 == 0){
            return a;
        }
        if(a%4 == 1){
            return 1;
        }
        if(a%4 == 2){
            return a+1;
        }
        return 0;
    }
}
