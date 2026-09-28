import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] charArr1 = word1.toCharArray();
        char[] charArr2 = word2.toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        word1 = new String(charArr1);
        word2 = new String(charArr2);
        System.out.print(word1.equals(word2)? "Yes": "No");
    }
}