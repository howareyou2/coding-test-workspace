import java.util.Scanner;
public class Main {
    static String text;
    static String pattern;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        text = sc.next();
        pattern = sc.next();
        // Please write your code here.
        int result = -1;
        for(int index = 0; index <= text.length() - pattern.length(); index++){
            if(check(index)){
                result = index;
                break;
            };
        }
        System.out.print(result);
    }

    static boolean check(int index){
        for(int i = 0; i < pattern.length(); i++){
            if(text.charAt(index + i) != pattern.charAt(i)) return false;
        }
        return true;
    }
}