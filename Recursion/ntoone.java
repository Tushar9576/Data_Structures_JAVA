public class ntoone {
    public static void main(String[] args) {
        printboth(5);
    }

    static void print(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
    static void printrev(int n) {
        if(n == 0){
            return;
        }
        printrev(n - 1);
        System.out.println(n);
    }
    static void printboth(int n) {
        if(n == 0){
            return;
        }
        System.out.println(n);
        printboth(n - 1);
        System.out.println(n);
    }

}
