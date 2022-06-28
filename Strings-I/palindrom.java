import java.util.Locale;

public class palindrom {
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrom(str));

    }
    static boolean ispalindrom(String str){
        if (str == null || str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length()-1-i);
            if (start != end){
                return false;
            }
        }
        return true;
    }
}
