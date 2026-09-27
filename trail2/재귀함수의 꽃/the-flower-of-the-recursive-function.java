import java.util.Scanner;
public class Main {
    static StringBuilder sb;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        sb = new StringBuilder();
        printNumber(n);
        System.out.print(sb.toString());
    }

    static void printNumber(int n){
        if(n == 0) return;
        sb.append(n).append(" ");
        printNumber(n - 1);
        sb.append(n).append(" ");
    }
}