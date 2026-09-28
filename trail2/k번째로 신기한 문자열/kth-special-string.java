import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String t = sc.next();
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        // Please write your code here.
        Arrays.sort(words);
        int count = 0;
        for(int i = 0; i < n; i++){
            if(check(words[i], t)){
                count++;
                if(count == k) {
                    System.out.print(words[i]);
                    break;
                }   
            }
        }
    }

    static boolean check(String target, String condition){
        for(int i = 0; i < condition.length(); i++){
            if(condition.charAt(i) != target.charAt(i)) return false;
        }
        return true;
    }
}