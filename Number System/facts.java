import java.util.ArrayList;

public class facts {
    public static void main(String[] args) {
        int n = 20;
        facts3(n);
    }
    // O(n)
    static void facts(int n){
        for (int i = 1; i <= n ; i++) {
            if(n%i == 0){
                System.out.print(i + " ");
            }
        }
    }
    // O(sqrt(n))
    static void facts2(int n){
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                }
            }
        }

    }
    // both time and space complexity will be O(sqrt(n))
    static void facts3(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n) ; i++) {
            if(n%i == 0){
                if(n/i == i){
                    System.out.print(i + " ");
                }
                else{
                    System.out.print(i + " " + n/i + " ");
                    list.add(n/i);
                }
            }
        }
        for (int j = list.size()-1; j >= 0 ; j--) {
            System.out.print(list.get(j) + " ");
        }

    }

}
