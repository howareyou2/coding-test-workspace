import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int num = 0;
        for(char n : binary.toCharArray()){
            num = num * 2 + (n -'0');
        }
        System.out.print(num);
    }
}