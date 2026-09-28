import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        // Please write your code here.
        char[] sArr = s.toCharArray();
        Arrays.sort(sArr);
        StringBuilder sb = new StringBuilder();
        for(char c: sArr){
            sb.append(c);
        }
        System.out.print(sb.toString());
    }
}