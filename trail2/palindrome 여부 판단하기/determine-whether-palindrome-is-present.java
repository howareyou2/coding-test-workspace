import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        System.out.print(checkPalindrome(input)? "Yes": "No");
    }

    static boolean checkPalindrome(String A){
        for(int index = 0; index < A.length() / 2; index++){
            if(A.charAt(index) != A.charAt(A.length() - 1 - index)) return false;
        }
        return true;
    }
}