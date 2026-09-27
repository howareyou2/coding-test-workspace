import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        System.out.print(checkChar(A)?"Yes":"No");
    }

    static boolean checkChar(String A){
        Set<Character> word = new HashSet<>();
        for(char w : A.toCharArray()){
            word.add(w);
            if(word.size() >= 2) return true;
        }
        return false;
    }
}